package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class AdvertDataVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pro_name;
	private String type;
	private String mall_id;//商场id
	private String hash_key;
	private int adExposureByIdConvergeSum;//曝光次数
	private String time;//时间
	private String adContent;//广告内容001
	private String adName;//广告名称001
	private String adType;//广告主001
	private String adStyle;//类型001
	private String adDeliveryTime;//累积投放时间
	private String adId;//广告ID
	
	private double commission;//分佣收入
	
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getMall_id() {
		return mall_id;
	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}
	public String getHash_key() {
		return hash_key;
	}
	public void setHash_key(String hash_key) {
		this.hash_key = hash_key;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getAdExposureByIdConvergeSum() {
		return adExposureByIdConvergeSum;
	}
	public void setAdExposureByIdConvergeSum(int adExposureByIdConvergeSum) {
		this.adExposureByIdConvergeSum = adExposureByIdConvergeSum;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getAdContent() {
		return adContent;
	}
	public void setAdContent(String adContent) {
		this.adContent = adContent;
	}
	public String getAdName() {
		return adName;
	}
	public void setAdName(String adName) {
		this.adName = adName;
	}
	public String getAdType() {
		return adType;
	}
	public void setAdType(String adType) {
		this.adType = adType;
	}
	public String getAdStyle() {
		return adStyle;
	}
	public void setAdStyle(String adStyle) {
		this.adStyle = adStyle;
	}
	public String getAdDeliveryTime() {
		return adDeliveryTime;
	}
	public void setAdDeliveryTime(String adDeliveryTime) {
		this.adDeliveryTime = adDeliveryTime;
	}
	public String getAdId() {
		return adId;
	}
	public void setAdId(String adId) {
		this.adId = adId;
	}
	public double getCommission() {
		return commission;
	}
	public void setCommission(double commission) {
		this.commission = commission;
	}
	@Override
	public String toString() {
		return "AdvertDataVO [pro_name=" + pro_name + ", type=" + type
				+ ", mall_id=" + mall_id + ", hash_key=" + hash_key
				+ ", adExposureByIdConvergeSum=" + adExposureByIdConvergeSum
				+ ", time=" + time + ", adContent=" + adContent + ", adName="
				+ adName + ", adType=" + adType + ", adStyle=" + adStyle
				+ ", adDeliveryTime=" + adDeliveryTime + ", adId=" + adId
				+ ", commission=" + commission + "]";
	}
	
}
