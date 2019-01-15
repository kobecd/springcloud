package com.rongyi.easy.coupon.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yandong on 2017/7/24.
 */
public class SzcUploadBatch implements Serializable{


    private Integer id;

    private String couponId;

    private Date createTime;

    private Integer pushState;

    private SzcUploadCount szcUploadCount;

    public void setCouponId(String couponId) {
        this.couponId = couponId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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

    public SzcUploadCount getSzcUploadCount() {
        return szcUploadCount;
    }

    public void setSzcUploadCount(SzcUploadCount szcUploadCount) {
        this.szcUploadCount = szcUploadCount;
    }

    public Integer getPushState() {
        return pushState;
    }

    public void setPushState(Integer pushState) {
        this.pushState = pushState;
    }
}
