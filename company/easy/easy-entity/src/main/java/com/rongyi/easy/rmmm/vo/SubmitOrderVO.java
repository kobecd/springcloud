package com.rongyi.easy.rmmm.vo;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.List;

public class SubmitOrderVO implements Serializable {

	// 父订单号集合
	private List<String> parentOrderNumList;
	// 电子会员卡券+商品的自提券码
	private List<String> couponCodeList ;
	// 实际需要支付价格
	private BigDecimal totalPrice;
	// 实际需要支付价格
	private BigDecimal totalExpressFee;


	public List<String> getCouponCodeList() {
		return couponCodeList;
	}

	public void setCouponCodeList(List<String> couponCodeList) {
		this.couponCodeList = couponCodeList;
	}

	public List<String> getParentOrderNumList() {
		return parentOrderNumList;
	}

	public void setParentOrderNumList(List<String> parentOrderNumList) {
		this.parentOrderNumList = parentOrderNumList;
	}

	public BigDecimal getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(BigDecimal totalPrice) {
		this.totalPrice = totalPrice;
	}

	public BigDecimal getTotalExpressFee() {
		return totalExpressFee;
	}

	public void setTotalExpressFee(BigDecimal totalExpressFee) {
		this.totalExpressFee = totalExpressFee;
	}

	@Override
	public String toString() {
		return "SubmitOrderVO{" +
				"couponCodeList=" + couponCodeList +
				", parentOrderNumList=" + parentOrderNumList +
				", totalPrice=" + totalPrice +
				", totalExpressFee=" + totalExpressFee +
				'}';
	}
}
