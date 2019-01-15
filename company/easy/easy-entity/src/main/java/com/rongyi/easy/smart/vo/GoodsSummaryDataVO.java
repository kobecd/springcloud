package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * 屏维度  订单统计
 * @author user
 *
 */
public class GoodsSummaryDataVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String dt;//时间
	private String mallMid;//商场ID
	private String terminalId;//设备编号
	private int orderCount;//订单数
	private int scanCount;//扫码次数
	private double tradingAmount;//交易金额
	private int tradingMembers;//交易人数
	private int tradingVolume;//交易数量
	private String goodsMid;//商品Mid
	
	public String getDt() {
		return dt;
	}
	public void setDt(String dt) {
		this.dt = dt;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public int getScanCount() {
		return scanCount;
	}
	public void setScanCount(int scanCount) {
		this.scanCount = scanCount;
	}
	public double getTradingAmount() {
		return tradingAmount;
	}
	public void setTradingAmount(double tradingAmount) {
		this.tradingAmount = tradingAmount;
	}
	public int getTradingMembers() {
		return tradingMembers;
	}
	public void setTradingMembers(int tradingMembers) {
		this.tradingMembers = tradingMembers;
	}
	public int getTradingVolume() {
		return tradingVolume;
	}
	public void setTradingVolume(int tradingVolume) {
		this.tradingVolume = tradingVolume;
	}
	public String getGoodsMid() {
		return goodsMid;
	}
	public void setGoodsMid(String goodsMid) {
		this.goodsMid = goodsMid;
	}
	@Override
	public String toString() {
		return "GoodsSummaryDataVO [dt=" + dt + ", mallMid=" + mallMid
				+ ", terminalId=" + terminalId + ", orderCount=" + orderCount
				+ ", scanCount=" + scanCount + ", tradingAmount="
				+ tradingAmount + ", tradingMembers=" + tradingMembers
				+ ", tradingVolume=" + tradingVolume + ", goodsMid=" + goodsMid
				+ "]";
	}
	
}
