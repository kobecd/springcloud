package com.rongyi.easy.rpb.vo.v6;

import com.rongyi.easy.rpb.domain.PaymentEntity;

import java.io.Serializable;
import java.math.BigDecimal;

/**
 * conan
 * 2017/3/15 15:07
 **/
public class PaymentEntityVo extends PaymentEntity implements Serializable{

    private static final long serialVersionUID = -8426312627749811666L;

    private String tradeNo;

    private String mchInfoId;//入驻商户id

    private String storeId;//门店id

    private String posNo;//设备号

    private String memo ;//备注

    private String webankOrderNo;

    //剩余可退金额
    private BigDecimal remainRefundAmount;
    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public String getWebankOrderNo() {
        return webankOrderNo;
    }

    public void setWebankOrderNo(String webankOrderNo) {
        this.webankOrderNo = webankOrderNo;
    }

    public BigDecimal getRemainRefundAmount() {
        return remainRefundAmount;
    }

    public void setRemainRefundAmount(BigDecimal remainRefundAmount) {
        this.remainRefundAmount = remainRefundAmount;
    }
}
