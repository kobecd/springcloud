package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class BaseVersionVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;
	private String version;
	private Integer type;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "BaseVersionVO [id=" + id + ", version=" + version + ", type="
				+ type + "]";
	}
	
}
