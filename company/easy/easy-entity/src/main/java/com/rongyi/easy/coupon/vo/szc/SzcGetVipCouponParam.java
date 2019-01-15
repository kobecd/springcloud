package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2017/7/28 16:43
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class SzcGetVipCouponParam implements Serializable {
    private static final long serialVersionUID = 7088251559328513027L;
    private String condType;
    private String condValue;
    private String cardCodeToCheck;
    private String verifyCode;
    private String storeCode;
    private String getType;

    public String getCondType() {
        return condType;
    }

    public void setCondType(String condType) {
        this.condType = condType;
    }

    public String getCondValue() {
        return condValue;
    }

    public void setCondValue(String condValue) {
        this.condValue = condValue;
    }

    public String getCardCodeToCheck() {
        return cardCodeToCheck;
    }

    public void setCardCodeToCheck(String cardCodeToCheck) {
        this.cardCodeToCheck = cardCodeToCheck;
    }

    public String getVerifyCode() {
        return verifyCode;
    }

    public void setVerifyCode(String verifyCode) {
        this.verifyCode = verifyCode;
    }

    public String getStoreCode() {
        return storeCode;
    }

    public void setStoreCode(String storeCode) {
        this.storeCode = storeCode;
    }

    public String getGetType() {
        return getType;
    }

    public void setGetType(String getType) {
        this.getType = getType;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
