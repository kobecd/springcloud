package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class SmartCommodityDetailVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commodityId;//商品id
	private String commodityName;//商品名称
	private List<String> picList;//图片集合
	private String categoryName;//分类名
	private String commodityCode;//商品编号
	private String brandName;//商品所属品牌名称
	private Integer source;//商品渠道
	private Integer stock;//库存
	private String originalPrice;//商品原价
    private String currentPrice;//商品现价
    private String commodityUrl;//商品网络地址
    private String grabTime;//抓取时间
	private String desc;//商品描述
	
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
	public String getCommodityCode() {
		return commodityCode;
	}
	public void setCommodityCode(String commodityCode) {
		this.commodityCode = commodityCode;
	}
	public String getBrandName() {
		return brandName;
	}
	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}
	public Integer getSource() {
		return source;
	}
	public void setSource(Integer source) {
		this.source = source;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
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
	public String getCommodityUrl() {
		return commodityUrl;
	}
	public void setCommodityUrl(String commodityUrl) {
		this.commodityUrl = commodityUrl;
	}
	public String getGrabTime() {
		return grabTime;
	}
	public void setGrabTime(String grabTime) {
		this.grabTime = grabTime;
	}
	public String getDesc() {
		return desc;
	}
	public void setDesc(String desc) {
		this.desc = desc;
	}
	@Override
	public String toString() {
		return "SmartCommodityDetailVO [commodityId=" + commodityId
				+ ", commodityName=" + commodityName + ", picList=" + picList
				+ ", categoryName=" + categoryName + ", commodityCode="
				+ commodityCode + ", brandName=" + brandName + ", source="
				+ source + ", stock=" + stock + ", originalPrice="
				+ originalPrice + ", currentPrice=" + currentPrice
				+ ", commodityUrl=" + commodityUrl + ", grabTime=" + grabTime
				+ ", desc=" + desc + "]";
	}
	
	
}
