package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class NewWeatherDetailVO implements Serializable{

	private String temp;//当前温度
	private String type;
	private String iconName;
	private Integer humidity;//湿度
	private String direct; //风向
	private String power;//风力
	private String aqi;//空气指数
	private String aqiInfo;//空气指数描述

	public Integer getHumidity() {
		return humidity;
	}

	public void setHumidity(Integer humidity) {
		this.humidity = humidity;
	}

	public String getTemp() {
		return temp;
	}

	public void setTemp(String temp) {
		this.temp = temp;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getIconName() {
		return iconName;
	}

	public void setIconName(String iconName) {
		this.iconName = iconName;
	}


	public String getDirect() {
		return direct;
	}

	public void setDirect(String direct) {
		this.direct = direct;
	}

	public String getPower() {
		return power;
	}

	public void setPower(String power) {
		this.power = power;
	}

	public String getAqi() {
		return aqi;
	}

	public void setAqi(String aqi) {
		this.aqi = aqi;
	}

	public String getAqiInfo() {
		return aqiInfo;
	}

	public void setAqiInfo(String aqiInfo) {
		this.aqiInfo = aqiInfo;
	}

	@Override
	public String toString() {
		return "NewWeatherDetailVO{" +
				"temp='" + temp + '\'' +
				", type='" + type + '\'' +
				", iconName='" + iconName + '\'' +
				", humidity=" + humidity +
				", direct='" + direct + '\'' +
				", power='" + power + '\'' +
				", aqi='" + aqi + '\'' +
				", aqiInfo='" + aqiInfo + '\'' +
				'}';
	}
}
