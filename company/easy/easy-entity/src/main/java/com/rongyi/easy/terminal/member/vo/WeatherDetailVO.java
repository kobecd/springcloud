package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class WeatherDetailVO implements Serializable{
	private String temp;
	private String low;
	private String high;
	private String type;
	private String iconName;
	private String fengxiang;
	private String fengli;
	
	public String getTemp() {
		return temp;
	}
	public void setTemp(String temp) {
		this.temp = temp;
	}
	public String getLow() {
		return low;
	}
	public void setLow(String low) {
		this.low = low;
	}
	public String getHigh() {
		return high;
	}
	public void setHigh(String high) {
		this.high = high;
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

	public String getFengxiang() {
		return fengxiang;
	}

	public void setFengxiang(String fengxiang) {
		this.fengxiang = fengxiang;
	}

	public String getFengli() {
		return fengli;
	}

	public void setFengli(String fengli) {
		this.fengli = fengli;
	}

	@Override
	public String toString() {
		return "WeatherDetailVO{" +
				"temp='" + temp + '\'' +
				", low='" + low + '\'' +
				", high='" + high + '\'' +
				", type='" + type + '\'' +
				", iconName='" + iconName + '\'' +
				", fengxiang='" + fengxiang + '\'' +
				", fengli='" + fengli + '\'' +
				'}';
	}
}
