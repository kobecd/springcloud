package com.rongyi.easy.roa.vo;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * 砂之船卡券详情返回VO
 *
 * @author user
 */
public class SzcCouponVO implements Serializable {

    /**
     *
     */
    private static final long serialVersionUID = 1L;

    private String id;//卡券id
    private String name;//卡券名称
    private Integer couponType;//卡券类型:代金券[0], 抵扣券[1], 红包[2],活动券[3]
    private String showType;
    private double origPrice;// 原价
    private double currPrice;// 现价
    private String publishStartAt;//发布开始时间
    private String publishEndAt;//发布结束时间
    private String limitDesc;// 使用限制
    private String usageDesc;// 使用说明
    private String useCondition;//使用条件
    private String preheatStartAt;//预热开始时间
    private String preheatEndAt;//预热结束时间
    private String businessTime;//营业时间
    private Integer couponStatus;//券状态 0预热未开始，1预热中，2活动中，3活动结束,4,已过期
    private String thumbnail;//缩略图
    private List<String> picList;//详情图列表
    private String couponCode;//券码
    private String payTime;//用券时间
    private String validDateStart;//有效期
    private String validDateEnd;//有效期
    private Integer szcCouponId;//砂之船卡券id


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCouponType() {
        return couponType;
    }

    public void setCouponType(Integer couponType) {
        this.couponType = couponType;
    }

    public double getOrigPrice() {
        return origPrice;
    }

    public void setOrigPrice(double origPrice) {
        this.origPrice = origPrice;
    }

    public double getCurrPrice() {
        return currPrice;
    }

    public void setCurrPrice(double currPrice) {
        this.currPrice = currPrice;
    }

    public String getPublishStartAt() {
        return publishStartAt;
    }

    public void setPublishStartAt(String publishStartAt) {
        this.publishStartAt = publishStartAt;
    }

    public String getPublishEndAt() {
        return publishEndAt;
    }

    public void setPublishEndAt(String publishEndAt) {
        this.publishEndAt = publishEndAt;
    }

    public String getLimitDesc() {
        return limitDesc;
    }

    public void setLimitDesc(String limitDesc) {
        this.limitDesc = limitDesc;
    }

    public String getUsageDesc() {
        return usageDesc;
    }

    public void setUsageDesc(String usageDesc) {
        this.usageDesc = usageDesc;
    }

    public String getUseCondition() {
        return useCondition;
    }

    public void setUseCondition(String useCondition) {
        this.useCondition = useCondition;
    }

    public String getPreheatStartAt() {
        return preheatStartAt;
    }

    public void setPreheatStartAt(String preheatStartAt) {
        this.preheatStartAt = preheatStartAt;
    }

    public String getBusinessTime() {
        return businessTime;
    }

    public void setBusinessTime(String businessTime) {
        this.businessTime = businessTime;
    }

    public Integer getCouponStatus() {
        return couponStatus;
    }

    public void setCouponStatus(Integer couponStatus) {
        this.couponStatus = couponStatus;
    }

    public String getThumbnail() {
        return thumbnail;
    }

    public void setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
    }

    public List<String> getPicList() {
        return picList;
    }

    public void setPicList(List<String> picList) {
        this.picList = picList;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getPayTime() {
        return payTime;
    }

    public void setPayTime(String payTime) {
        this.payTime = payTime;
    }

    public Integer getSzcCouponId() {
        return szcCouponId;
    }

    public void setSzcCouponId(Integer szcCouponId) {
        this.szcCouponId = szcCouponId;
    }

    public String getPreheatEndAt() {
        return preheatEndAt;
    }

    public void setPreheatEndAt(String preheatEndAt) {
        this.preheatEndAt = preheatEndAt;
    }

    public String getShowType() {
        return showType;
    }

    public void setShowType(String showType) {
        this.showType = showType;
    }


    public String getValidDateStart() {
        return validDateStart;
    }

    public void setValidDateStart(String validDateStart) {
        this.validDateStart = validDateStart;
    }

    public String getValidDateEnd() {
        return validDateEnd;
    }

    public void setValidDateEnd(String validDateEnd) {
        this.validDateEnd = validDateEnd;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
