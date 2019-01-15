package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/***
 * 数据打包进度返回VO
 * @author user
 *
 */
public class ProgressVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String fileName;//压缩包名
	private String fileUrl;//压缩包路径
	private Integer status;//打包状态 0:打包中 1:打包成功2:打包失败
	private Integer progress;//进度 数字
	private String reason;//失败原因
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public String getFileUrl() {
		return fileUrl;
	}
	public void setFileUrl(String fileUrl) {
		this.fileUrl = fileUrl;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getProgress() {
		return progress;
	}
	public void setProgress(Integer progress) {
		this.progress = progress;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "ProgressVO [fileName=" + fileName + ", fileUrl=" + fileUrl
				+ ", status=" + status + ", progress=" + progress + ", reason="
				+ reason + "]";
	}
	
}
