package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class PM25DetailVO implements Serializable{
	/**
	 * 空气质量指数(AQI)，即air quality index，是定量描述空气质量状况的无纲量指数
	 */
	private String aqi;
	/**
	 * 城市名称
	 */
	private String area;
	/**
	 * 颗粒物（粒径小于等于2.5μm）1小时平均
	 */
	private String pm25;
	/**
	 * 颗粒物（粒径小于等于2.5μm）24小时滑动平均
	 */
	private String pm2524h;
	/**
	 * 首要污染物
	 */
	private String primaryPollutant;
	private String quality;
	
	public String getAqi() {
		return aqi;
	}
	public void setAqi(String aqi) {
		this.aqi = aqi;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public String getPm25() {
		return pm25;
	}
	public void setPm25(String pm25) {
		this.pm25 = pm25;
	}
	public String getPm2524h() {
		return pm2524h;
	}
	public void setPm2524h(String pm2524h) {
		this.pm2524h = pm2524h;
	}
	public String getPrimaryPollutant() {
		return primaryPollutant;
	}
	public void setPrimaryPollutant(String primaryPollutant) {
		this.primaryPollutant = primaryPollutant;
	}
	public String getQuality() {
		return quality;
	}
	public void setQuality(String quality) {
		this.quality = quality;
	}
	@Override
	public String toString() {
		return "PM25DetailVO [aqi=" + aqi + ", area=" + area + ", pm25=" + pm25 + ", pm2524h=" + pm2524h
				+ ", primaryPollutant=" + primaryPollutant + ", quality=" + quality + "]";
	}
	
}
