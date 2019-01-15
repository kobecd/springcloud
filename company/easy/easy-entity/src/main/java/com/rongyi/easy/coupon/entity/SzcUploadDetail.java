package com.rongyi.easy.coupon.entity;

import java.io.Serializable;

/**
 * Created by yandong on 2017/7/24.
 */
public class SzcUploadDetail implements Serializable{

    private Integer id;

    private String phone;

    private Integer batchId;

    private Integer pushState;

    private Integer sendSmsState;

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Integer getPushState() {
        return pushState;
    }

    public void setPushState(Integer pushState) {
        this.pushState = pushState;
    }

    public Integer getSendSmsState() {
        return sendSmsState;
    }

    public void setSendSmsState(Integer sendSmsState) {
        this.sendSmsState = sendSmsState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
