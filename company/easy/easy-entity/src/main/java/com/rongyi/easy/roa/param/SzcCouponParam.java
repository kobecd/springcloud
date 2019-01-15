package com.rongyi.easy.roa.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * 砂之船卡券参数
 *
 * @author user
 */
public class SzcCouponParam implements Serializable {


    private static final long serialVersionUID = 3231835805101550689L;
    private String couponId;//卡券id
    private String uId;//用户的id
    private String openId;//
    private String phone;//手机号
    private Integer status;//0:所有券, 1:未使用, 2:已使用,3:已过期
    private Integer szcCouponId;//砂之船couponId
    private String couponCode;//券码
    private String mallId;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getCouponId() {
        return couponId;
    }

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public String getuId() {
        return uId;
    }

    public void setuId(String uId) {
        this.uId = uId;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getSzcCouponId() {
        return szcCouponId;
    }

    public void setSzcCouponId(Integer szcCouponId) {
        this.szcCouponId = szcCouponId;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }

}
