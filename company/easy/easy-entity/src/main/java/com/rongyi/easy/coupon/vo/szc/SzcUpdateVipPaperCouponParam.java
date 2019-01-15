package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Description:砂之船领取卡券参数
 * Author: yb
 * DATE: 2017/7/27 16:59
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class SzcUpdateVipPaperCouponParam implements Serializable{
    private static final long serialVersionUID = 6122758555632765525L;
    //会员卡号
    private String vipId;
    //砂之船卡券id
    private Integer couponId;
    //智拿活动id
    private Integer promId;
    //赠券金额
    private String couponMoney;
    //使用结束日期
    private String canUseEndDate;
    //门店代码
    private String storeCode;
    //门店合同id
    private Integer shopContractId;
    //促销申请单号
    private String billId;

    public String getVipId() {
        return vipId;
    }

    public void setVipId(String vipId) {
        this.vipId = vipId;
    }

    public Integer getCouponId() {
        return couponId;
    }

    public void setCouponId(Integer couponId) {
        this.couponId = couponId;
    }

    public Integer getPromId() {
        return promId;
    }

    public void setPromId(Integer promId) {
        this.promId = promId;
    }

    public String getCouponMoney() {
        return couponMoney;
    }

    public void setCouponMoney(String couponMoney) {
        this.couponMoney = couponMoney;
    }

    public String getCanUseEndDate() {
        return canUseEndDate;
    }

    public void setCanUseEndDate(String canUseEndDate) {
        this.canUseEndDate = canUseEndDate;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Integer getShopContractId() {
        return shopContractId;
    }

    public void setShopContractId(Integer shopContractId) {
        this.shopContractId = shopContractId;
    }

    public String getBillId() {
        return billId;
    }

    public void setBillId(String billId) {
        this.billId = billId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
