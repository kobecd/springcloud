package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * Author: yb
 * DATE: 2017/7/20 18:55
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class GetCouponPromItemResponse  {
    private boolean GetCouponPromItemResult;
    private String msg;
    private List<CouponPromItem> CouponPromItems;

    public boolean isGetCouponPromItemResult() {
        return GetCouponPromItemResult;
    }

    public void setGetCouponPromItemResult(boolean getCouponPromItemResult) {
        GetCouponPromItemResult = getCouponPromItemResult;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public List<CouponPromItem> getCouponPromItems() {
        return CouponPromItems;
    }

    public void setCouponPromItems(List<CouponPromItem> couponPromItems) {
        CouponPromItems = couponPromItems;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
