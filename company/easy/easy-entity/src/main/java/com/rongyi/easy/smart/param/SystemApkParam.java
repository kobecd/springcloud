package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class SystemApkParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * mac地址
	 */
	private String mac;
	/**
	 * 版本号
	 */
	private String version;
	
	public String getMac() {
		return mac;
	}
	public void setMac(String mac) {
		this.mac = mac;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	@Override
	public String toString() {
		return "SystemApkParam [mac=" + mac + ", version=" + version + "]";
	}
	
	
}
