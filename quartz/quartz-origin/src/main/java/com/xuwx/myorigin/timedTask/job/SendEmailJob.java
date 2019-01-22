package com.xuwx.myorigin.timedTask.job;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.Job;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;

/**
 * 定时任务实现类 (邮件发送)
 * Created by xuwx on 2018/11/29.
 */
@DisallowConcurrentExecution
public class SendEmailJob implements Job {
    @Override
    public void execute(JobExecutionContext context) throws JobExecutionException {
        System.out.println("邮件发送");
    }
}
