package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class SmartCommodityVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private List<String> picList;//图片列表
	private String categoryName;//分类 1>2>3>
	private Integer stock;//库存
	private Integer status;//状态
	private Integer terminalType;//显示终端
    private String originalPrice;//商品原价
    private String currentPrice;//商品现价

	private Integer isSelect;//是否已选中

	public Integer getIsSelect() {
		return isSelect;
	}

	public void setIsSelect(Integer isSelect) {
		this.isSelect = isSelect;
	}

	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	public List<String> getPicList() {
		return picList;
	}
	public void setPicList(List<String> picList) {
		this.picList = picList;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}
	public String getOriginalPrice() {
		return originalPrice;
	}
	public void setOriginalPrice(String originalPrice) {
		this.originalPrice = originalPrice;
	}
	public String getCurrentPrice() {
		return currentPrice;
	}
	public void setCurrentPrice(String currentPrice) {
		this.currentPrice = currentPrice;
	}
	@Override
	public String toString() {
		return "SmartCommodityVO [commodityId=" + commodityId
				+ ", commodityName=" + commodityName + ", picList=" + picList
				+ ", categoryName=" + categoryName + ", stock=" + stock
				+ ", status=" + status + ", terminalType=" + terminalType
				+ ", originalPrice=" + originalPrice + ", currentPrice="
				+ currentPrice + "]";
	}
    
}
