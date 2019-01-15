package com.rongyi.easy.coupon.vo.szc;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * Description: 砂之船 获取卡券列表 webService 接口 返回的xml，数据节点。
 * Author: yb
 * DATE: 2017/7/20 18:29
 * Package:com.rongyi.easy.coupon.vo.szc
 * Project:easy-market
 */
public class CouponPromItem  {

    /**    <?xml version="1.0" encoding="utf-8"?>
<soap:Envelope xmlns:xsi="http://www.w3.org/2001/XMLSchema-instance" xmlns:xsd="http://www.w3.org/2001/XMLSchema" xmlns:soap="http://schemas.xmlsoap.org/soap/envelope/">
  <soap:Body>
    <GetCouponPromItemResponse xmlns="http://tempuri.org/">
      <GetCouponPromItemResult>boolean</GetCouponPromItemResult>
      <msg>string</msg>
      <CouponPromItems>
        <CouponPromItem>
          <coupontype>string</coupontype>
          <couponname>string</couponname>
          <couponBeginDate>string</couponBeginDate>
          <couponValidDate>string</couponValidDate>
          <couponNote>string</couponNote>
          <status>int</status>
          <ShopContract>string</ShopContract>
          <ShopName>string</ShopName>
          <ShopContractId>int</ShopContractId>
          <BillId>int</BillId>
        </CouponPromItem>
        <CouponPromItem>
          <coupontype>string</coupontype>
          <couponname>string</couponname>
          <couponBeginDate>string</couponBeginDate>
          <couponValidDate>string</couponValidDate>
          <couponNote>string</couponNote>
          <status>int</status>
          <ShopContract>string</ShopContract>
          <ShopName>string</ShopName>
          <ShopContractId>int</ShopContractId>
          <BillId>int</BillId>
        </CouponPromItem>
      </CouponPromItems>
    </GetCouponPromItemResponse>
  </soap:Body>
    */
    private String coupontype;
    private String couponname;
    private String couponBeginDate;
    private String couponValidDate;
    private String couponNote;
    private Integer status;
    private String ShopName;
    private String ShopContractId;
    private String ShopContract;
    private String BillId;

    public String getShopContract() {
        return ShopContract;
    }

    public void setShopContract(String shopContract) {
        ShopContract = shopContract;
    }

    public String getCoupontype() {
        return coupontype;
    }

    public void setCoupontype(String coupontype) {
        this.coupontype = coupontype;
    }

    public String getCouponname() {
        return couponname;
    }

    public void setCouponname(String couponname) {
        this.couponname = couponname;
    }

    public String getCouponBeginDate() {
        return couponBeginDate;
    }

    public void setCouponBeginDate(String couponBeginDate) {
        this.couponBeginDate = couponBeginDate;
    }

    public String getCouponValidDate() {
        return couponValidDate;
    }

    public void setCouponValidDate(String couponValidDate) {
        this.couponValidDate = couponValidDate;
    }

    public String getCouponNote() {
        return couponNote;
    }

    public void setCouponNote(String couponNote) {
        this.couponNote = couponNote;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getShopName() {
        return ShopName;
    }

    public void setShopName(String shopName) {
        ShopName = shopName;
    }

    public String getShopContractId() {
        return ShopContractId;
    }

    public void setShopContractId(String shopContractId) {
        ShopContractId = shopContractId;
    }

    public String getBillId() {
        return BillId;
    }

    public void setBillId(String billId) {
        BillId = billId;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
