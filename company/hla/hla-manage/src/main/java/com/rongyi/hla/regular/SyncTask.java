package com.rongyi.hla.regular;

import com.rongyi.entity.product.PullLog;
import com.rongyi.hla.agent.GroupAgent;
import com.rongyi.hla.agent.SkuAgent;
import com.rongyi.hla.agent.SpuAgent;
import com.rongyi.hla.service.product.PullLogService;
import com.rongyi.utils.HostUtil;
import com.rongyi.utils.StaticField;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 定时同步任务
 */
@Slf4j
@Component
public class SyncTask {

    @Autowired
    private PullLogService pullLogService;

    @Autowired
    private SkuAgent skuAgent;

    @Autowired
    private SpuAgent spuAgent;


    @Autowired
    private GroupAgent groupAgent;

    /**
     * 定时器
     * 线上30分钟执行一次
     */
//    @Scheduled(cron = "0 0/30 * * * ?")//线上30分钟执行一次
    @Scheduled(cron = " 0 0/1 * * * ?")//测试1分钟执行一次
    //    @Scheduled(cron = " 0 0/2 * * * ?")//测试2分钟执行一次
//    @Scheduled(cron = " 0 0/3 * * * ?")//测试3分钟执行一次
    public void sync() {
        Date start = new Date();
        log.info("#####定时任务开始,时间{}", start);

        PullLog skuResult = null;
        PullLog spuResult = null;
        PullLog groupRpuResult = null;
        try {

            skuResult = skuAgent.syncProducts();
            spuResult = spuAgent.syncSpus();
            groupRpuResult = groupAgent.syncGroups();


        } catch (Exception e) {
            log.error("失败的同步商品任务，出现异常！任务耗时 {} S,错误详情\n{}", (System.currentTimeMillis() - start.getTime()) / 1000, e.getMessage(), HostUtil.getHostNameAtAddress());
        } finally {
            //记录日志到数据库  三个操作的开始动作的时刻是不同的，（单线程运行操作，操作耗时）故需要分别记录



           log.debug("skuResult {}",skuResult);
           log.debug("spuResult {}",spuResult);
           log.debug("spuResult{}",groupRpuResult);

            try {
                if (skuResult == null) {
                    skuResult = new PullLog(StaticField.OPERATE_NAME_FOR_SKU, "异常，等待下次同步", false);
                }
                    pullLogService.save(skuResult);
            } catch (Exception e) {
                log.error("记录日志失败--sku，出现异常！定时任务至此耗时 {} S,错误详情 \n{}", (System.currentTimeMillis() - start.getTime()) / 1000, e.getMessage(), HostUtil.getHostNameAtAddress());
            }
            try {
                if (spuResult== null) {
                    spuResult = new PullLog(StaticField.OPERATE_NAME_FOR_SPU, "异常，等待下次同步", false);
                }
                pullLogService.save(spuResult);
            } catch (Exception e) {
                log.error("记录日志失败--spu，出现异常！定时任务至此耗时 {} S,错误详情\n{}", (System.currentTimeMillis() - start.getTime()) / 1000, e.getMessage(), HostUtil.getHostNameAtAddress());
            }
            try {
                if (groupRpuResult == null) {
                    groupRpuResult = new PullLog(StaticField.OPERATE_NAME_FOR_GROUP, "异常，等待下次同步", false);
                }
                pullLogService.save(groupRpuResult);
            } catch (Exception e) {
                log.error("记录日志失败--group，出现异常！定时任务至此耗时 {} S,错误详情\n{}", (System.currentTimeMillis() - start.getTime()) / 1000, e.getMessage(), HostUtil.getHostNameAtAddress());
            }

        }
    }


}

