package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class UploadAppParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String appName;//app名称
	private String appVersion;//app版本号
	public String getAppName() {
		return appName;
	}
	public void setAppName(String appName) {
		this.appName = appName;
	}
	public String getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(String appVersion) {
		this.appVersion = appVersion;
	}
	@Override
	public String toString() {
		return "UploadAppParam [appName=" + appName + ", appVersion="
				+ appVersion + "]";
	}
	
	
}
