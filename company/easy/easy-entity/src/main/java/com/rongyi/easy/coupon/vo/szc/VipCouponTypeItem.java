package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import javax.xml.bind.annotation.XmlAttribute;
import java.io.Serializable;

/**
 * Description:
 * Author: yb
 * DATE: 2017/7/20 18:27
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class VipCouponTypeItem {

    private String coupontype;
    private String couponname;

    @XmlAttribute(name="coupontype")
    public String getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype;
    }
    @XmlAttribute(name="couponname")
    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
