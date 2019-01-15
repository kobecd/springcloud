package com.rongyi.easy.smart.param;

import java.io.Serializable;

import com.rongyi.easy.bsoms.param.BaseParam;

public class MonitorParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;
	private String mallName;
	private String appId;
	private String version;//
	private Integer id;//
	private Integer osType;//系统类型

	public Integer getOsType() {
		return osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
	}

	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
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
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "MonitorParam [mallId=" + mallId + ", mallName=" + mallName
				+ ", appId=" + appId + ", version=" + version + ", id=" + id
				+ "]";
	}
	
}
