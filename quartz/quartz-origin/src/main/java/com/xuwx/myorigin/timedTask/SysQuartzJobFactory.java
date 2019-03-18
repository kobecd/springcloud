package com.xuwx.myorigin.timedTask;

import com.xuwx.myorigin.domain.SysQuartzJob;
import com.xuwx.myorigin.service.ISysQuartzJobService;
import org.quartz.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 调度工厂
 * Created by xuwx on 2018/11/29.
 */
@Configuration
@EnableScheduling
@Component
public class SysQuartzJobFactory {

    private static Logger logger = LoggerFactory.getLogger(SysQuartzJobFactory.class);

    //当前trigger(触发的)使用的
    private Map<String ,String> jobUniqueMap = new HashMap<>();

    @Autowired
    private SchedulerFactoryBean schedulerFactoryBean;

    @Autowired
    private ISysQuartzJobService sysQuartzJobService;

    public SchedulerFactoryBean getSchedulerFactoryBean() {
        return schedulerFactoryBean;
    }

    public void setSchedulerFactoryBean(SchedulerFactoryBean schedulerFactoryBean) {
        this.schedulerFactoryBean = schedulerFactoryBean;
    }

    public ISysQuartzJobService getSysQuartzJobService() {
        return sysQuartzJobService;
    }

    public void setSysQuartzJobService(ISysQuartzJobService sysQuartzJobService) {
        this.sysQuartzJobService = sysQuartzJobService;
    }

    @Scheduled(fixedRate = 5000)//每隔5s查询数据库 并根据查询结果决定是否重新设置定时任务
    public void scheduleUpdateCronTrigger()throws Exception{
        try {
            //schedulerFactoryBean 由 spring 创建并注入 得到定时任务调度器Scheduler
            Scheduler scheduler = schedulerFactoryBean.getScheduler();
            //查询到查询出的已启用的定时任务信息
            List<SysQuartzJob> jobLists = sysQuartzJobService.findUsedLegallyJobList();

            //获取最新的禁用任务列表  将其从调度器中删除,并且从 jobUniqueMap中删除
            List<SysQuartzJob> deleteJobList = sysQuartzJobService.findDeleteJobList();
            for (SysQuartzJob deleteJob : deleteJobList) {
                JobKey jobKey = JobKey.jobKey(deleteJob.getJobName(), deleteJob.getJobGroup());
                scheduler.deleteJob(jobKey);
                jobUniqueMap.remove(TriggerKey.triggerKey(deleteJob.getJobName(), deleteJob.getJobGroup()));
            }

            for (SysQuartzJob job : jobLists) {
                TriggerKey triggerKey = TriggerKey.triggerKey(job.getJobName(), job.getJobGroup());
                CronTrigger trigger = (CronTrigger) scheduler.getTrigger(triggerKey);
                //该job在数据库中的时间表达式
                String cronExpression = job.getCronExpression();
                if (null == trigger) {
                    //JobDetail jobDetail = JobBuilder.newJob(QuartzJobFactory.class).withIdentity(job.getJobName(), job.getJobGroup()).build();
                    try {
                        @SuppressWarnings("unchecked")
                        Class<? extends Job> clazz = (Class<? extends Job>) Class.forName(job.getQuartzClass());
                        JobDetail jobDetail = JobBuilder.newJob(clazz).withIdentity(job.getJobName(), job.getJobGroup()).build();
                        jobDetail.getJobDataMap().put("scheduleJob", job);

                        //表达式调度构建器
                        CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(job.getCronExpression());
                        //按新的cron表达式构建一个trigger
                        trigger = TriggerBuilder.newTrigger().withIdentity(job.getJobName(), job.getJobGroup()).withSchedule(scheduleBuilder).build();
                        jobUniqueMap.put(triggerKey.toString(), trigger.getCronExpression());

                        //currentCron = trigger.getCronExpression();

                        scheduler.scheduleJob(jobDetail, trigger);
                    } catch (Exception e) {
                        e.printStackTrace();
                        logger.error(e.getMessage());
                    }
                } else if (!jobUniqueMap.get(triggerKey.toString()).equals(cronExpression)) {
                    //Trigger 已经存在 ,那么更新相应的定时任务设置
                    //表达式调度构建器
                    CronScheduleBuilder scheduleBuilder = CronScheduleBuilder.cronSchedule(cronExpression);

                    // 按新的cronExpression表达式重新构建trigger

                    trigger = (CronTrigger) scheduler.getTrigger(triggerKey);

                    trigger = trigger.getTriggerBuilder().withIdentity(triggerKey).withSchedule(scheduleBuilder).build();
                    // 按新的trigger重新设置job执行
                    scheduler.rescheduleJob(triggerKey, trigger);

                    jobUniqueMap.put(triggerKey.toString(), cronExpression);

                }
            }
        }catch (Exception e){
            e.printStackTrace();
            logger.error(e.getMessage());
        }
    }

}
