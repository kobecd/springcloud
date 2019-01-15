package com.rongyi.easy.malllife.param.gameApi;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

/*
 * Description:  
 * Author: yuzhijian 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * yuzhijian       2018/1/24    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class CouponApiParam extends MalllifeBaseParam {

    /**
     * 卡券id
     */
    private String couponId;
    /**
     * 券码
     */
    private String couponCode;
    /**
     * 领取渠道
     */
    private Integer channel;

    /**
     * 活动id
     */
    private String activityId;

    /**
     * 活动名字
     */
    private String activityName;

    /**
     * 活动类型
     */
    private Integer activityType;


    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getChannel() {
        return channel;
    }

    public void setChannel(Integer channel) {
        this.channel = channel;
    }

    public String getActivityId() {
        return activityId;
    }

    public void setActivityId(String activityId) {
        this.activityId = activityId;
    }

    public String getActivityName() {
        return activityName;
    }

    public void setActivityName(String activityName) {
        this.activityName = activityName;
    }

    public Integer getActivityType() {
        return activityType;
    }

    public void setActivityType(Integer activityType) {
        this.activityType = activityType;
    }
}
