package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlAttribute;
import java.io.Serializable;
import java.util.List;

/**
 * Description:
 * Author: yb
 * DATE: 2017/7/20 18:57
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class GetCouponTypeResponse {
    private boolean GetCouponTypeResult;
    private String msg;
    private List<VipCouponTypeItem> VipCouponTypeItems;

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
    @XmlAttribute(name="GetCouponTypeResult")
    public boolean isGetCouponTypeResult() {
        return GetCouponTypeResult;
    }

    public void setGetCouponTypeResult(boolean getCouponTypeResult) {
        GetCouponTypeResult = getCouponTypeResult;
    }

    @XmlAttribute(name="msg")
    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
    @XmlAttribute(name="VipCouponTypeItems")
    public List<VipCouponTypeItem> getVipCouponTypeItems() {
        return VipCouponTypeItems;
    }

    public void setVipCouponTypeItems(List<VipCouponTypeItem> vipCouponTypeItems) {
        VipCouponTypeItems = vipCouponTypeItems;
    }
}
