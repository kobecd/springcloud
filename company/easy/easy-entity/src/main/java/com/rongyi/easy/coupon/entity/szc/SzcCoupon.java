package com.rongyi.easy.coupon.entity.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.Date;

public class SzcCoupon implements Serializable{
    private Integer id;

    private String couponId;

    private String couponType;

    private Integer szcStatus;

    private String shopContract;

    private String shopName;

    private Integer shopContractId;

    private Integer billId;

    private String showType;

    private String useCondition;

    private Byte giveOutType;

    private Date preheatStartAt;

    private Date preheatEndAt;

    private String businessTime;

    private Byte created;

    //门店代码
    private String storeCode;

    //是否发送短信；0:未发；1：已发
    private Integer sended;

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getCouponType() {
        return couponType;
    }

    public void setCouponType(String couponType) {
        this.couponType = couponType;
    }

    public Integer getSzcStatus() {
        return szcStatus;
    }

    public void setSzcStatus(Integer szcStatus) {
        this.szcStatus = szcStatus;
    }

    public String getShopContract() {
        return shopContract;
    }

    public void setShopContract(String shopContract) {
        this.shopContract = shopContract;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public Integer getShopContractId() {
        return shopContractId;
    }

    public void setShopContractId(Integer shopContractId) {
        this.shopContractId = shopContractId;
    }

    public Integer getBillId() {
        return billId;
    }

    public void setBillId(Integer billId) {
        this.billId = billId;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }

    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition;
    }

    public Byte getGiveOutType() {
        return giveOutType;
    }

    public void setGiveOutType(Byte giveOutType) {
        this.giveOutType = giveOutType;
    }

    public Date getPreheatStartAt() {
        return preheatStartAt;
    }

    public void setPreheatStartAt(Date preheatStartAt) {
        this.preheatStartAt = preheatStartAt;
    }

    public Date getPreheatEndAt() {
        return preheatEndAt;
    }

    public void setPreheatEndAt(Date preheatEndAt) {
        this.preheatEndAt = preheatEndAt;
    }

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public Byte getCreated() {
        return created;
    }

    public void setCreated(Byte created) {
        this.created = created;
    }

    public Integer getSended() {
        return sended;
    }

    public void setSended(Integer sended) {
        this.sended = sended;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
