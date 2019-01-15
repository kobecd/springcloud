package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class DataPackParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//商场id
	private String path;//文件存储路径
	private Integer moduleId;//应用模板id
	private int version;//数据版本号
	private String upaiyunUrl;//upaiyun存储路径
	private String resourceFilePath; //资源文件路径
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getModuleId() {
		return moduleId;
	}
	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}
	public int getVersion() {
		return version;
	}
	public void setVersion(int version) {
		this.version = version;
	}
	public String getUpaiyunUrl() {
		return upaiyunUrl;
	}
	public void setUpaiyunUrl(String upaiyunUrl) {
		this.upaiyunUrl = upaiyunUrl;
	}

	public String getResourceFilePath() {
		return resourceFilePath;
	}

	public void setResourceFilePath(String resourceFilePath) {
		this.resourceFilePath = resourceFilePath;
	}

	@Override
	public String toString() {
		return "DataPackParam{" +
				"mallId='" + mallId + '\'' +
				", path='" + path + '\'' +
				", moduleId=" + moduleId +
				", version=" + version +
				", upaiyunUrl='" + upaiyunUrl + '\'' +
				", resourceFilePath='" + resourceFilePath + '\'' +
				'}';
	}

}
