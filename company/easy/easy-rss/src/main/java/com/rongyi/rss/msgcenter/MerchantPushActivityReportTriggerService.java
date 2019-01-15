package com.rongyi.rss.msgcenter;

/**
 * @author: yb
 * Description:
 * DATE: 2018/3/9 11:46
 * Package:com.rongyi.rss.msgcenter
 * Project:easy-common
 */
public interface MerchantPushActivityReportTriggerService {
    /**
     * 定时统计每天的统计数据,推送后30天内。每天凌晨1点触发一次
     */
    void statisticDayReport();

    /**
     * 定时统计每小时的统计数据.每个小时触发一次
     */
    void statisticHourReport();
}
