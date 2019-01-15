package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class ApiFileVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer version;//数据包版本号
	private String fileUrl;//数据包路径
	private String md5;//文件md5值
	
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
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	@Override
	public String toString() {
		return "ApiFileVO [version=" + version + ", fileUrl=" + fileUrl
				+ ", md5=" + md5 + "]";
	}
	
}
