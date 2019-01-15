package com.rongyi.easy.coupon.entity;

import java.io.Serializable;

/**
 * Created by yandong on 2017/7/24.
 */
public class SzcUploadCount implements Serializable{


    private Integer total = 0;

    private Integer batchId = 0;

    private Integer succNum = 0;

    private Integer errNum = 0;

    private Integer waitNum = 0;

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    public Integer getSuccNum() {
        return succNum;
    }

    public void setSuccNum(Integer succNum) {
        this.succNum = succNum;
    }

    public Integer getErrNum() {
        return errNum;
    }

    public void setErrNum(Integer errNum) {
        this.errNum = errNum;
    }

    public Integer getWaitNum() {
        return waitNum;
    }

    public void setWaitNum(Integer waitNum) {
        this.waitNum = waitNum;
    }
}
