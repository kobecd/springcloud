package com.rongyi.easy.smart.param;


import java.io.Serializable;

public class AppParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String appId;//APK应用ID
	private String appVersion;//APK对应的版本号
	
	private Integer osType;// 设备系统类型: 1  安卓, 2 windows
	
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	public Integer getOsType() {
		return osType;
	}
	public void setOsType(Integer osType) {
		this.osType = osType;
	}
	@Override
	public String toString() {
		return "AppParam [appId=" + appId + ", appVersion=" + appVersion
				+ ", osType=" + osType + "]";
	}
	
}
