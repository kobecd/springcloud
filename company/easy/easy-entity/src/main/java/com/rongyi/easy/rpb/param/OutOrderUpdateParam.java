package com.rongyi.easy.rpb.param;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

/**
 * Created by shaozhou on 2018/3/4.
 */
public class OutOrderUpdateParam implements Serializable {
    private String paymentOrderNo;//容易网订单号
    private String outOrderNo;//外部订单编号
    private Integer payType;//支付方式 payType CARD=0;WECHAT=1;ALIPAY=2;CASH=3;
    private BigDecimal payAmout;//付款金额 元
    private Date payTime;//支付时间
    private String serialNo;//pos设备号

    public String getPaymentOrderNo() {
        return paymentOrderNo;
    }

    public void setPaymentOrderNo(String paymentOrderNo) {
        this.paymentOrderNo = paymentOrderNo;
    }

    public String getOutOrderNo() {
        return outOrderNo;
    }

    public void setOutOrderNo(String outOrderNo) {
        this.outOrderNo = outOrderNo;
    }

    public Integer getPayType() {
        return payType;
    }

    public void setPayType(Integer payType) {
        this.payType = payType;
    }

    public BigDecimal getPayAmout() {
        return payAmout;
    }

    public void setPayAmout(BigDecimal payAmout) {
        this.payAmout = payAmout;
    }

    public Date getPayTime() {
        return payTime;
    }

    public void setPayTime(Date payTime) {
        this.payTime = payTime;
    }

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    @Override
    public String toString() {
        return "OutOrderUpdateParam{" +
                "paymentOrderNo='" + paymentOrderNo + '\'' +
                ", outOrderNo='" + outOrderNo + '\'' +
                ", payType=" + payType +
                ", payAmout=" + payAmout +
                ", payTime=" + payTime +
                ", serialNo='" + serialNo + '\'' +
                '}';
    }
}
