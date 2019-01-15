package com.rongyi.rss.payapi.param;

import java.io.Serializable;

/**
 * 退款dubbo接口请求参数
 * Created by sujuan on 2017/7/7.
 */
public class PayRefundParam implements Serializable{

    private String orderNo;//商户订单号

    private String payNo;//容易网流水号

    private String tradeNo;//第三方交易流水号

    private String webankOrderNo;//微众流水号

    private Integer payType;//支付方式(0:支付宝,1:微信)

    private Integer totalAmount;//订单金额（单位分）

    private Integer refundAmount;//退款金额(单位分)

    private String refundReason;//退款原因

    private String ryMchId;//容易网商户号

    private String  ryAppId;//容易网应用号

    private String source;//来源(0:容易逛,1:微信,2:终端屏,3:福利pos,4:外部渠道)

    private String timeStamp;//时间戳

    private String sign;//签名串

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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public String getWebankOrderNo() {
        return webankOrderNo;
    }

    public void setWebankOrderNo(String webankOrderNo) {
        this.webankOrderNo = webankOrderNo;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public Integer getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(Integer totalAmount) {
        this.totalAmount = totalAmount;
    }

    public Integer getRefundAmount() {
        return refundAmount;
    }

    public void setRefundAmount(Integer refundAmount) {
        this.refundAmount = refundAmount;
    }

    public String getRefundReason() {
        return refundReason;
    }

    public void setRefundReason(String refundReason) {
        this.refundReason = refundReason;
    }

    public String getRyMchId() {
        return ryMchId;
    }

    public void setRyMchId(String ryMchId) {
        this.ryMchId = ryMchId;
    }

    public String getRyAppId() {
        return ryAppId;
    }

    public void setRyAppId(String ryAppId) {
        this.ryAppId = ryAppId;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getTimeStamp() {
        return timeStamp;
    }

    public void setTimeStamp(String timeStamp) {
        this.timeStamp = timeStamp;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }


    @Override
    public String toString() {
        return "PayRefundParam{" +
                "orderNo='" + orderNo + '\'' +
                ", payNo='" + payNo + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", webankOrderNo='" + webankOrderNo + '\'' +
                ", payType=" + payType +
                ", totalAmount=" + totalAmount +
                ", refundAmount=" + refundAmount +
                ", refundReason='" + refundReason + '\'' +
                ", ryMchId='" + ryMchId + '\'' +
                ", ryAppId='" + ryAppId + '\'' +
                ", source='" + source + '\'' +
                ", timeStamp='" + timeStamp + '\'' +
                ", sign='" + sign + '\'' +
                '}';
    }
}
