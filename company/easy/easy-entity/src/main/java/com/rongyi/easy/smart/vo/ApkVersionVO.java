package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class ApkVersionVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String name;
	private String appId;
	private String packUrl;
	private Integer status;
	private String mallId;
	private Integer version;
	private String baseVersion;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getPackUrl() {
		return packUrl;
	}
	public void setPackUrl(String packUrl) {
		this.packUrl = packUrl;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getBaseVersion() {
		return baseVersion;
	}
	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
	}
	@Override
	public String toString() {
		return "ApkVersionVO [id=" + id + ", name=" + name + ", appId=" + appId
				+ ", packUrl=" + packUrl + ", status=" + status + ", mallId="
				+ mallId + ", version=" + version + ", baseVersion="
				+ baseVersion + "]";
	}
	
}
