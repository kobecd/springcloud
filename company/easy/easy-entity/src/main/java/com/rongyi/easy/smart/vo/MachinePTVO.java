package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * 设备点位配置VO
 * @author user
 *
 */
public class MachinePTVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 设备编号
	 */
	private String terminalId;
	/**
	 * 点位
	 */
	private String location;
	/**
	 * 设备执行模板
	 */
	private String deviceModule;


	/**
	 * mac地址
	 */
	private String mac;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDeviceModule() {
		return deviceModule;
	}
	public void setDeviceModule(String deviceModule) {
		this.deviceModule = deviceModule;
	}

	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}

	@Override
	public String toString() {
		return "MachinePTVO [terminalId=" + terminalId + ", location="
				+ location + ", deviceModule=" + deviceModule + "]";
	}
	
}
