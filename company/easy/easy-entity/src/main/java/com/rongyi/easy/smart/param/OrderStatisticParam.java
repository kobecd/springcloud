package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.List;

/**
 * 订单统计（屏维度）
 * @author user
 *
 */
public class OrderStatisticParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String startDt;//开始日期
	private String endDt;//结束时间
	private String mallMid;//商场id
	private List<String> terminalIds;//互动屏ID列表
	private List<String> goodsIds;//商品id集合
	
	public String getStartDt() {
		return startDt;
	}
	public void setStartDt(String startDt) {
		this.startDt = startDt;
	}
	public String getEndDt() {
		return endDt;
	}
	public void setEndDt(String endDt) {
		this.endDt = endDt;
	}
	public String getMallMid() {
		return mallMid;
	}
	public void setMallMid(String mallMid) {
		this.mallMid = mallMid;
	}
	public List<String> getTerminalIds() {
		return terminalIds;
	}
	public void setTerminalIds(List<String> terminalIds) {
		this.terminalIds = terminalIds;
	}
	public List<String> getGoodsIds() {
		return goodsIds;
	}
	public void setGoodsIds(List<String> goodsIds) {
		this.goodsIds = goodsIds;
	}
	@Override
	public String toString() {
		return "OrderStatisticParam [startDt=" + startDt + ", endDt=" + endDt
				+ ", mallMid=" + mallMid + ", terminalIds=" + terminalIds
				+ ", goodsIds=" + goodsIds + "]";
	}
	
}
