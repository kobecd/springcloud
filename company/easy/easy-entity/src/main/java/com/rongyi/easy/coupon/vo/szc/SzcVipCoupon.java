package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2017/7/28 17:17
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class SzcVipCoupon implements Serializable {
    private int couponType;
    private String couponTypeName;
    private String validDate;
    private String balance;
    private String couponCode;
    private Integer promId;
    private Integer shopContractID;
    private String payTime;

    public int getCouponType() {
        return couponType;
    }

    public void setCouponType(int couponType) {
        this.couponType = couponType;
    }

    public String getCouponTypeName() {
        return couponTypeName;
    }

    public void setCouponTypeName(String couponTypeName) {
        this.couponTypeName = couponTypeName;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getBalance() {
        return balance;
    }

    public void setBalance(String balance) {
        this.balance = balance;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public Integer getPromId() {
        return promId;
    }

    public void setPromId(Integer promId) {
        this.promId = promId;
    }

    public Integer getShopContractID() {
        return shopContractID;
    }

    public void setShopContractID(Integer shopContractID) {
        this.shopContractID = shopContractID;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
