package com.rongyi.easy.rpb.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

/**
 * Created by shaozhou on 2017/3/30.
 */
public class OrderSettleDetailVo implements Serializable {
    private Long couponUsed;
    private String orderNo;
    private Long payAmount;
    private String ryShopNo;//容易商户号
    private String payShopNo;//支付渠道商户号
    private Integer paymentChannel;//支付渠道 0微众银行、1容易网服务商、2拉卡拉、3容易网
    private String paymentNo;//支付渠道流水号
    private String cashName;
    private Long paymentTime;
    private Integer paymentType;
    private String posNo;//pos终端号
    private Long poundage;
    private Long realAmount;
    private Integer reductionUsed;
    private String ryPaymentNo;//容易支付交易流水
    private Long scoreDiscount;
    private Integer scoreUsed;
    private String shopName;//商户名称
    private String shopNo;//商户号
    private Integer status;
    private Integer payTerminal;//支付终端 1移动pos 2扫码支付
    private String oRyPayNo;//原商户订单号
    private Integer paymentOrderId; //支付流水表id
    private String refundRejected;//允许退款(0:允许，1：拒绝)
    private String ryMchId;
    private String ryAppId;
    private String tradeNo;

    private String mchInfoId;//入驻商户id

    private String storeId;//门店id

    private Integer tradeType;

    private String memo ;//备注

    private BigDecimal remainRefundAmount;

    private Integer payerReconFlag; //0:未对账,1:对账一致,2:对账不一致
    private List<OrderSettleDetailVo> detailVoList;

    public Long getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(Long couponUsed) {
        this.couponUsed = couponUsed;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public String getPayShopNo() {
        return payShopNo;
    }

    public void setPayShopNo(String payShopNo) {
        this.payShopNo = payShopNo;
    }

    public Integer getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(Integer paymentChannel) {
        this.paymentChannel = paymentChannel;
    }

    public String getPaymentNo() {
        return paymentNo;
    }

    public void setPaymentNo(String paymentNo) {
        this.paymentNo = paymentNo;
    }

    public String getCashName() {
        return cashName;
    }

    public void setCashName(String cashName) {
        this.cashName = cashName;
    }

    public Long getPaymentTime() {
        return paymentTime;
    }

    public void setPaymentTime(Long paymentTime) {
        this.paymentTime = paymentTime;
    }

    public Integer getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(Integer paymentType) {
        this.paymentType = paymentType;
    }

    public String getPosNo() {
        return posNo;
    }

    public void setPosNo(String posNo) {
        this.posNo = posNo;
    }

    public Long getPoundage() {
        return poundage;
    }

    public void setPoundage(Long poundage) {
        this.poundage = poundage;
    }

    public Long getRealAmount() {
        return realAmount;
    }

    public void setRealAmount(Long realAmount) {
        this.realAmount = realAmount;
    }

    public Integer getReductionUsed() {
        return reductionUsed;
    }

    public void setReductionUsed(Integer reductionUsed) {
        this.reductionUsed = reductionUsed;
    }

    public String getRyPaymentNo() {
        return ryPaymentNo;
    }

    public void setRyPaymentNo(String ryPaymentNo) {
        this.ryPaymentNo = ryPaymentNo;
    }

    public Long getScoreDiscount() {
        return scoreDiscount;
    }

    public void setScoreDiscount(Long scoreDiscount) {
        this.scoreDiscount = scoreDiscount;
    }

    public Integer getScoreUsed() {
        return scoreUsed;
    }

    public void setScoreUsed(Integer scoreUsed) {
        this.scoreUsed = scoreUsed;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName;
    }

    public String getShopNo() {
        return shopNo;
    }

    public void setShopNo(String shopNo) {
        this.shopNo = shopNo;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getRyShopNo() {
        return ryShopNo;
    }

    public void setRyShopNo(String ryShopNo) {
        this.ryShopNo = ryShopNo;
    }

    public Integer getPayTerminal() {
        return payTerminal;
    }

    public void setPayTerminal(Integer payTerminal) {
        this.payTerminal = payTerminal;
    }

    public String getoRyPayNo() {
        return oRyPayNo;
    }

    public void setoRyPayNo(String oRyPayNo) {
        this.oRyPayNo = oRyPayNo;
    }

    public Integer getPaymentOrderId() {
        return paymentOrderId;
    }

    public void setPaymentOrderId(Integer paymentOrderId) {
        this.paymentOrderId = paymentOrderId;
    }

    public String getRefundRejected() {
        return refundRejected;
    }

    public void setRefundRejected(String refundRejected) {
        this.refundRejected = refundRejected;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
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

    public BigDecimal getRemainRefundAmount() {
        return remainRefundAmount;
    }

    public void setRemainRefundAmount(BigDecimal remainRefundAmount) {
        this.remainRefundAmount = remainRefundAmount;
    }

    @Override
    public String toString() {
        return "OrderSettleDetailVo{" +
                "memo='" + memo + '\'' +
                ", couponUsed=" + couponUsed +
                ", orderNo='" + orderNo + '\'' +
                ", payAmount=" + payAmount +
                ", ryShopNo='" + ryShopNo + '\'' +
                ", payShopNo='" + payShopNo + '\'' +
                ", paymentChannel=" + paymentChannel +
                ", paymentNo='" + paymentNo + '\'' +
                ", cashName='" + cashName + '\'' +
                ", paymentTime=" + paymentTime +
                ", paymentType=" + paymentType +
                ", posNo='" + posNo + '\'' +
                ", poundage=" + poundage +
                ", realAmount=" + realAmount +
                ", reductionUsed=" + reductionUsed +
                ", ryPaymentNo='" + ryPaymentNo + '\'' +
                ", scoreDiscount=" + scoreDiscount +
                ", scoreUsed=" + scoreUsed +
                ", shopName='" + shopName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", status=" + status +
                ", payTerminal=" + payTerminal +
                ", oRyPayNo='" + oRyPayNo + '\'' +
                ", paymentOrderId=" + paymentOrderId +
                ", refundRejected='" + refundRejected + '\'' +
                ", tradeNo='" + tradeNo + '\'' +
                ", mchInfoId='" + mchInfoId + '\'' +
                ", storeId='" + storeId + '\'' +
                '}';
    }

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

    public String getMemo() {
        return memo;
    }

    public void setMemo(String memo) {
        this.memo = memo;
    }

    public Integer getPayerReconFlag() {
        return payerReconFlag;
    }

    public void setPayerReconFlag(Integer payerReconFlag) {
        this.payerReconFlag = payerReconFlag;
    }

    public List<OrderSettleDetailVo> getDetailVoList() {
        return detailVoList;
    }

    public void setDetailVoList(List<OrderSettleDetailVo> detailVoList) {
        this.detailVoList = detailVoList;
    }

    public static Integer convertPayType(Integer payChannel){
    	Integer result = new Integer(0);
    	if(payChannel!=null){
    		if(payChannel ==0)
    			result = 0;
    		if(payChannel ==1){
    			result =1;
    		}
    		if(payChannel ==2){ //现金
    			result =3;
    		} 		
    	}
    	return result;
    }
}
