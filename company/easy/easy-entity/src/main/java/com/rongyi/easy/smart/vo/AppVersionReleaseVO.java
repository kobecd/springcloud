package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class AppVersionReleaseVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//
	private String mallId;
	private String appId;
	private String version;
	private Integer versionCode;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}
	@Override
	public String toString() {
		return "AppVersionReleaseVO [id=" + id + ", mallId=" + mallId
				+ ", appId=" + appId + ", version=" + version
				+ ", versionCode=" + versionCode + "]";
	}
	
}
