package com.rongyi.easy.coupon.param;

import com.rongyi.easy.coupon.vo.TCCouponVO;

import java.io.Serializable;

/*
 * @description:  检查限购参数
 * @author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2018/7/5    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class CouponOrderLimitParam implements Serializable {

    private static final long serialVersionUID = 2380504028203082317L;

    /**
     * 卡券
     */
    private TCCouponVO coupon;

    /**
     * 手机号
     */
    private String mobile;

    /**
     * 设备
     */
    private String devId;

    private String payAccount;

    /**
     * 购买数量
     */
    private Integer buyNum;

    private String userId;

    /**
     * 广告标识
     */
    private String idfa;

    public TCCouponVO getCoupon() {
        return coupon;
    }

    public void setCoupon(TCCouponVO coupon) {
        this.coupon = coupon;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getDevId() {
        return devId;
    }

    public void setDevId(String devId) {
        this.devId = devId;
    }

    public String getPayAccount() {
        return payAccount;
    }

    public void setPayAccount(String payAccount) {
        this.payAccount = payAccount;
    }

    public Integer getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(Integer buyNum) {
        this.buyNum = buyNum;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getIdfa() {
        return idfa;
    }

    public void setIdfa(String idfa) {
        this.idfa = idfa;
    }

    @Override
    public String toString() {
        return "CouponOrderLimitParam{" +
                "coupon=" + coupon +
                ", mobile='" + mobile + '\'' +
                ", devId='" + devId + '\'' +
                ", payAccount='" + payAccount + '\'' +
                ", buyNum=" + buyNum +
                ", userId='" + userId + '\'' +
                ", idfa='" + idfa + '\'' +
                '}';
    }
}
