package com.rongyi.easy.rpb.dto;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by shaozhou on 2017/7/27.
 */
public class PaymentQueryDto implements Serializable {
    private String orderNo;//
    private Integer tradeType;//0:购买 1:退款 9 撤销
    private Integer status;// 0:待打款 1:款已打 2:款已到
    private Integer payChannel;//支付方式（0:支付宝 1:微信 2:pos银行卡,3:现金,6:翼支付）
    private String payNo;
    private String tradeNo;//第三方 微信/支付宝交易号
    private String webankOrderNo;//微众银行订单号
    private Date payStartAt;//交易开始时间
    private Date payEndAt;//交易结束时间

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getPayChannel() {
        return payChannel;
    }

    public void setPayChannel(Integer payChannel) {
        this.payChannel = payChannel;
    }

    public String getPayNo() {
        return payNo;
    }

    public void setPayNo(String payNo) {
        this.payNo = payNo;
    }

    public String getWebankOrderNo() {
        return webankOrderNo;
    }

    public void setWebankOrderNo(String webankOrderNo) {
        this.webankOrderNo = webankOrderNo;
    }

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
    }

    public Date getPayEndAt() {
        return payEndAt;
    }

    public void setPayEndAt(Date payEndAt) {
        this.payEndAt = payEndAt;
    }

    public Date getPayStartAt() {
        return payStartAt;
    }

    public void setPayStartAt(Date payStartAt) {
        this.payStartAt = payStartAt;
    }

    @Override
    public String toString() {
        return "PaymentQueryDto{" +
                "orderNo='" + orderNo + '\'' +
                ", tradeType=" + tradeType +
                ", status=" + status +
                ", payChannel=" + payChannel +
                ", payNo='" + payNo + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", webankOrderNo='" + webankOrderNo + '\'' +
                ", payStartAt=" + payStartAt +
                ", payEndAt=" + payEndAt +
                '}';
    }
}
