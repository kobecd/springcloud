package com.rongyi.easy.coupon.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/27 17:21
 * Package:com.rongyi.easy.coupon.param
 * Project:easy-common
 */
public class CouponReversalParam implements Serializable{
    private static final long serialVersionUID = 65554654707770276L;
    private String code;
    private Integer reverseUserId;
    private String reverseUserName;
    private String mallId;
    private String shopId;

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getReverseUserId() {
        return reverseUserId;
    }

    public void setReverseUserId(Integer reverseUserId) {
        this.reverseUserId = reverseUserId;
    }

    public String getReverseUserName() {
        return reverseUserName;
    }

    public void setReverseUserName(String reverseUserName) {
        this.reverseUserName = reverseUserName;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
