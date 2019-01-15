package com.rongyi.easy.code;

import java.util.List;

/**
 * Created by shaozhou on 2016/12/22.
 */
public class JiadeliVerifyCodeParam extends ThirdCouponParam {

	private static final long serialVersionUID = 5970063946935257327L;

	//商家门店或设备编号
	private String storesId;

	//订单金额（单位：元 2位小数）
	private String amount;
   //订单详情
	private List<JiadeliOrderDetailParam > orderDetail;
	//阿拉丁posOrderid
	private String posOrderId;
	//轮循次数
	private Integer loopNumber;

	public String getPosOrderId() {
		return posOrderId;
	}

	public void setPosOrderId(String posOrderId) {
		this.posOrderId = posOrderId;
	}

	public Integer getLoopNumber() {
		return loopNumber;
	}

	public void setLoopNumber(Integer loopNumber) {
		this.loopNumber = loopNumber;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public String getStoresId() {
		return storesId;
	}

	public void setStoresId(String storesId) {
		this.storesId = storesId;
	}


	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	public List<JiadeliOrderDetailParam> getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(List<JiadeliOrderDetailParam> orderDetail) {
		this.orderDetail = orderDetail;
	}
}
