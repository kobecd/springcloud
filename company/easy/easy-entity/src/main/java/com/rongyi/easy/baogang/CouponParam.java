package com.rongyi.easy.baogang;

import java.io.Serializable;
import java.util.List;

/**
 * Created by zengzhimin on 2017/11/24.
 */
public class CouponParam implements Serializable {

    private String businessId;

    private String storesId;

    private String telephone;

    private String couponCode;

    private String modifyDateTime;

    private String orderNumber;

    private String serialNumber;

    private String amount;

    private List<CouponOrderDetailParam> orderDetail;

    public List<CouponOrderDetailParam> getOrderDetail() {
        return orderDetail;
    }

    public void setOrderDetail(List<CouponOrderDetailParam> orderDetail) {
        this.orderDetail = orderDetail;
    }

    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public String getStoresId() {
        return storesId;
    }

    public void setStoresId(String storesId) {
        this.storesId = storesId;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getCouponCode() {
        return couponCode;
    }

    public void setCouponCode(String couponCode) {
        this.couponCode = couponCode;
    }

    public String getModifyDateTime() {
        return modifyDateTime;
    }

    public void setModifyDateTime(String modifyDateTime) {
        this.modifyDateTime = modifyDateTime;
    }

    public String getOrderNumber() {
        return orderNumber;
    }

    public void setOrderNumber(String orderNumber) {
        this.orderNumber = orderNumber;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }
}
