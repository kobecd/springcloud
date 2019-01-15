package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class VersionApiVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;
	private String terminalId;
	private Integer version;//数据包版本号
	private String fileUrl;//数据包路径
	private Integer osType;//系统类型  1:安卓,2 windows
	
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
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public Integer getOsType() {
		return osType;
	}
	public void setOsType(Integer osType) {
		this.osType = osType;
	}
	@Override
	public String toString() {
		return "VersionApiVO [mallId=" + mallId + ", terminalId=" + terminalId
				+ ", version=" + version + ", fileUrl=" + fileUrl + ", osType="
				+ osType + "]";
	}
	
}
