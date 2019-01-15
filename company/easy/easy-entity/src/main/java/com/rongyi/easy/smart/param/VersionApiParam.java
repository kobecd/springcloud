package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class VersionApiParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;
	private String terminalId;
	private String appId;
	private Integer appVersion;
	private Integer type;// 1 系统服务
	private Integer osType;//1：安卓, 2：windows
//	"mallId": "123",
//    "terminalId": "345",
//    "appId": "com.rongyi.terminalstandard",
//    "appVersion": 100
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public Integer getAppVersion() {
		return appVersion;
	}
	public void setAppVersion(Integer appVersion) {
		this.appVersion = appVersion;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getOsType() {
		return osType;
	}
	public void setOsType(Integer osType) {
		this.osType = osType;
	}
	@Override
	public String toString() {
		return "VersionApiParam [mallId=" + mallId + ", terminalId="
				+ terminalId + ", appId=" + appId + ", appVersion="
				+ appVersion + ", type=" + type + ", osType=" + osType + "]";
	}
	
}
