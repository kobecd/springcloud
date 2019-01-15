package com.rongyi.easy.rpb.vo;

import java.io.Serializable;

/**
 * Created by shaozhou on 2017/3/30.
 */
public class OrderSettleVo implements Serializable {
    private String orderNo;//订单编号
    private Long couponUsed;//卡券抵扣
    private Long payAmount;//净收金额
    private Integer paymentChannel;//支付渠道 0微众银行、1容易网服务商、2拉卡拉、3容易网
    private Long paymentTime;//支付时间
    private Integer paymentType;//支付方式 0:支付宝 1:微信
    private Long poundage;//手续费
    private Long realAmount;//订单总金额
    private Integer reductionUsed;//满减金额
    private Long scoreDiscount;//积分抵扣金额
    private Integer scoreUsed;//积分抵扣
    private String shopName;//商户名称
    private String shopNo;//容易网商户号
    private Integer status;//1已付款、2已退款
    private Integer payTerminal;//支付终端 1pos 2扫码
    private String oRyPayNo;//原商户订单号
    private String ryPayNo;
    private Integer mchInfoId;//商户id
    private String tradeNo;//容易网交易号
    private String storeId;//门店号
    private String posNo;//设备号
    private String memo;//备注
    private Long payedAmount;//实际支付金额
    private Integer tradeType;//交易类型
    private Long settleAt;//结算时间
    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public Long getCouponUsed() {
        return couponUsed;
    }

    public void setCouponUsed(Long couponUsed) {
        this.couponUsed = couponUsed;
    }

    public Long getPayAmount() {
        return payAmount;
    }

    public void setPayAmount(Long payAmount) {
        this.payAmount = payAmount;
    }

    public Integer getPaymentChannel() {
        return paymentChannel;
    }

    public void setPaymentChannel(Integer paymentChannel) {
        this.paymentChannel = paymentChannel;
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

    public String getTradeNo() {
        return tradeNo;
    }

    public void setTradeNo(String tradeNo) {
        this.tradeNo = tradeNo;
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

    public Integer getMchInfoId() {
		return mchInfoId;
	}

	public void setMchInfoId(Integer mchInfoId) {
		this.mchInfoId = mchInfoId;
	}

    public Long getPayedAmount() {
        return payedAmount;
    }

    public void setPayedAmount(Long payedAmount) {
        this.payedAmount = payedAmount;
    }

    public Integer getTradeType() {
        return tradeType;
    }

    public void setTradeType(Integer tradeType) {
        this.tradeType = tradeType;
    }

    public String getRyPayNo() {
        return ryPayNo;
    }

    public void setRyPayNo(String ryPayNo) {
        this.ryPayNo = ryPayNo;
    }

    public Long getSettleAt() {
        return settleAt;
    }

    public void setSettleAt(Long settleAt) {
        this.settleAt = settleAt;
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
	@Override
    public String toString() {
        return "OrderSettleVo{" +
                "orderNo='" + orderNo + '\'' +
                ", couponUsed=" + couponUsed +
                ", payAmount=" + payAmount +
                ", paymentChannel=" + paymentChannel +
                ", paymentTime=" + paymentTime +
                ", paymentType=" + paymentType +
                ", poundage=" + poundage +
                ", realAmount=" + realAmount +
                ", reductionUsed=" + reductionUsed +
                ", scoreDiscount=" + scoreDiscount +
                ", scoreUsed=" + scoreUsed +
                ", shopName='" + shopName + '\'' +
                ", shopNo='" + shopNo + '\'' +
                ", status=" + status +
                ", payTerminal=" + payTerminal +
                ", mchInfoId=" + mchInfoId +
                '}';
    }
}
