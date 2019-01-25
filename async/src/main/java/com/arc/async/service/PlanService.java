package com.arc.async.service;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/25 14:23
 */
public interface PlanService {

    /**
     * 异步调用系统服务去发送邮件
     *
     * @param id 任务id
     * @return true/false
     */
    boolean sandMail(long id);

    void sandMailV2(long id);
}
