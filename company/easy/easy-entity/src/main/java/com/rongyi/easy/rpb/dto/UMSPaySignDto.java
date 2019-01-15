package com.rongyi.easy.rpb.dto;

import java.io.Serializable;

/*
 * @description:  银联 公众号支付业务参数
 * @author: zhuming 
 * History: 变更记录
 * <Author>     <time>    <version>    <desc>
 * zhuming     2018/5/17    1.0        创建文件 
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
public class UMSPaySignDto implements Serializable{


    private static final long serialVersionUID = -1817482562718273723L;

    //订单号
    private String orderNo;
    //支付单号
    private String payNo;
    //支付金额，单位分
    private Integer totalFee;
    //订单标题
    private String subject;
    //商品描述
    private String body;
    //附加信息
    private String attach;
    //openId
    private String openId;
    //用户支付二维码
    private String authCode;
    //订单类型
    private Integer orderType;
    //备注
    private String memo ;
    //入驻的商户号
    private String mchInfoId;
    //门店号
    private String storeId;
    //设备号
    private String posNo;
    //扩展参数
    private String extend;

    //银联终端号
    private String terminalNo;

    //银联商户号
    private String umsMchId;

    //退款金额
    private Integer refundAmount;

    //退款订单号
    private String refundOrderNo;

    //退款说明
    private String refundDesc;

    //退款支付单号
    private String refundPayNo;

    //签名
    private String signature;

    //银联b扫c订单号
    private String umsOrderId;

    //支付方式
    private Integer payChannel;
    //支付通道id
    private Integer mchPayId;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public Integer getTotalFee() {
        return totalFee;
    }

    public void setTotalFee(Integer totalFee) {
        this.totalFee = totalFee;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAttach() {
        return attach;
    }

    public void setAttach(String attach) {
        this.attach = attach;
    }

    public String getOpenId() {
        return openId;
    }

    public void setOpenId(String openId) {
        this.openId = openId;
    }

    public String getAuthCode() {
        return authCode;
    }

    public void setAuthCode(String authCode) {
        this.authCode = authCode;
    }

    public Integer getOrderType() {
        return orderType;
    }

    public void setOrderType(Integer orderType) {
        this.orderType = orderType;
    }

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getMchInfoId() {
        return mchInfoId;
    }

    public void setMchInfoId(String mchInfoId) {
        this.mchInfoId = mchInfoId;
    }

    public String getStoreId() {
        return storeId;
    }

    public void setStoreId(String storeId) {
        this.storeId = storeId;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public String getExtend() {
        return extend;
    }

    public void setExtend(String extend) {
        this.extend = extend;
    }

    public String getTerminalNo() {
        return terminalNo;
    }

    public void setTerminalNo(String terminalNo) {
        this.terminalNo = terminalNo;
    }


    public String getUmsMchId() {
        return umsMchId;
    }

    public void setUmsMchId(String umsMchId) {
        this.umsMchId = umsMchId;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundOrderNo() {
        return refundOrderNo;
    }

    public void setRefundOrderNo(String refundOrderNo) {
        this.refundOrderNo = refundOrderNo;
    }

    public String getRefundDesc() {
        return refundDesc;
    }

    public void setRefundDesc(String refundDesc) {
        this.refundDesc = refundDesc;
    }

    public String getRefundPayNo() {
        return refundPayNo;
    }

    public void setRefundPayNo(String refundPayNo) {
        this.refundPayNo = refundPayNo;
    }

    public String getSignature() {
        return signature;
    }

    public void setSignature(String signature) {
        this.signature = signature;
    }


    public String getUmsOrderId() {
        return umsOrderId;
    }

    public void setUmsOrderId(String umsOrderId) {
        this.umsOrderId = umsOrderId;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }


    public Integer getMchPayId() {
        return mchPayId;
    }

    public void setMchPayId(Integer mchPayId) {
        this.mchPayId = mchPayId;
    }

    @Override
    public String toString() {
        return "UMSPaySignDto{" +
                "orderNo='" + orderNo + '\'' +
                ", payNo='" + payNo + '\'' +
                ", totalFee=" + totalFee +
                ", subject='" + subject + '\'' +
                ", body='" + body + '\'' +
                ", attach='" + attach + '\'' +
                ", openId='" + openId + '\'' +
                ", authCode='" + authCode + '\'' +
                ", orderType=" + orderType +
                ", memo='" + memo + '\'' +
                ", mchInfoId='" + mchInfoId + '\'' +
                ", storeId='" + storeId + '\'' +
                ", posNo='" + posNo + '\'' +
                ", extend='" + extend + '\'' +
                ", terminalNo='" + terminalNo + '\'' +
                ", umsMchId='" + umsMchId + '\'' +
                ", refundAmount=" + refundAmount +
                ", refundOrderNo='" + refundOrderNo + '\'' +
                ", refundDesc='" + refundDesc + '\'' +
                ", refundPayNo='" + refundPayNo + '\'' +
                ", signature='" + signature + '\'' +
                ", umsOrderId='" + umsOrderId + '\'' +
                ", payChannel=" + payChannel +
                ", mchPayId=" + mchPayId +
                '}';
    }
}
