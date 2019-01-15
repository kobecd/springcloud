package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class SmartCouponVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;//优惠券id
	/**
     * 优惠券说明描述
     */
    private String description;

    /**
     * 优惠券类型 --> 1:抵用券(显示"元"字图标) 2:折扣券(显示"折"字图标)
     */
    private int type;

    /**
     * 二维码内容
     */
    private String qrCode;

    /**
     * 二维码图片地址
     */
    private String qrCodePic;

    /**
     * 二维码图片本地路径地址
     */
    private String localQrCodePic;

    /**
     * 原价 字符串，不能返回空串，0元用"0.00"表示
     */
    private String originalPrice;

    /**
     * 现价 字符串，不能返回空串，0元用"0.00"表示
     */
    private String currentPrice;

    /**
     * 关联的店铺ID
     */
    private List<String> shops;

    /**
     * 库存数据
     */
    private int stock;

    /**
     * 是否过期 布尔值
     */
    private boolean isExpired;

    /**
     * 优惠券使用限制说明
     */
    private String useLimitDec;

    /**
     * 优惠券开始领取时间 10位时间戳 秒为单位
     */
    private Long privateStartTime;

    /**
     * 优惠券停止领取时间 10位时间戳 秒为单位
     */
    private Long privateStartEnd;

    /**
     * 优惠券图片列表
     */
    private List<String> pictures;

    /**
     * 优惠券图片本地资源路径列表
     */
    private List<String> localPictures;
    
    private int sort;
    
    private String title;//标题

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getQrCode() {
		return qrCode;
	}

	public void setQrCode(String qrCode) {
		this.qrCode = qrCode;
	}

	public String getQrCodePic() {
		return qrCodePic;
	}

	public void setQrCodePic(String qrCodePic) {
		this.qrCodePic = qrCodePic;
	}

	public String getLocalQrCodePic() {
		return localQrCodePic;
	}

	public void setLocalQrCodePic(String localQrCodePic) {
		this.localQrCodePic = localQrCodePic;
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
	

	public List<String> getShops() {
		return shops;
	}

	public void setShops(List<String> shops) {
		this.shops = shops;
	}

	public int getStock() {
		return stock;
	}

	public void setStock(int stock) {
		this.stock = stock;
	}

	public boolean isExpired() {
		return isExpired;
	}

	public void setExpired(boolean isExpired) {
		this.isExpired = isExpired;
	}

	public String getUseLimitDec() {
		return useLimitDec;
	}

	public void setUseLimitDec(String useLimitDec) {
		this.useLimitDec = useLimitDec;
	}

	public Long getPrivateStartTime() {
		return privateStartTime;
	}

	public void setPrivateStartTime(Long privateStartTime) {
		this.privateStartTime = privateStartTime;
	}

	public Long getPrivateStartEnd() {
		return privateStartEnd;
	}

	public void setPrivateStartEnd(Long privateStartEnd) {
		this.privateStartEnd = privateStartEnd;
	}

	public List<String> getPictures() {
		return pictures;
	}

	public void setPictures(List<String> pictures) {
		this.pictures = pictures;
	}

	public List<String> getLocalPictures() {
		return localPictures;
	}

	public void setLocalPictures(List<String> localPictures) {
		this.localPictures = localPictures;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Override
	public String toString() {
		return "SmartCouponVO [id=" + id + ", description=" + description
				+ ", type=" + type + ", qrCode=" + qrCode + ", qrCodePic="
				+ qrCodePic + ", localQrCodePic=" + localQrCodePic
				+ ", originalPrice=" + originalPrice + ", currentPrice="
				+ currentPrice + ", shops=" + shops + ", stock=" + stock
				+ ", isExpired=" + isExpired + ", useLimitDec=" + useLimitDec
				+ ", privateStartTime=" + privateStartTime
				+ ", privateStartEnd=" + privateStartEnd + ", pictures="
				+ pictures + ", localPictures=" + localPictures + ", sort="
				+ sort + ", title=" + title + "]";
	}
	
}
