package com.rongyi.easy.smart.param;

import java.io.Serializable;

import com.rongyi.easy.bsoms.param.BaseParam;

public class VersionRelaseMallParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String name;//APP应用名
	private String mallId;//商场id
	private String mallName;//商场名称
	private String version;//应用版本号
	private Integer id;//应用版本列表对应的id
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
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
		return "VersionRelaseMallParam [name=" + name + ", mallId=" + mallId
				+ ", mallName=" + mallName + ", version=" + version + ", id="
				+ id + "]";
	}
	
}
