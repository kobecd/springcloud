package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class ElectShelfParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 商场ID
	 */
	private String mallId;
	/**
	 * 数据版本号
	 */
	private int version;
	/**
	 * 电子货架应用模版ID
	 */
	private Integer moduleId;
	/**
	 * 文件存储路径
	 */
	private String path;
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public Integer getModuleId() {
		return moduleId;
	}
	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	@Override
	public String toString() {
		return "ElectShelfParam [mallId=" + mallId + ", version=" + version
				+ ", moduleId=" + moduleId + ", path=" + path + "]";
	}
	
}
