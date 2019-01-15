package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class AppDataUpdateVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 商场id
	 */
	private String mallId;
	/**
	 * 设备编号
	 */
	private String terminalId;
	/**
	 * 模板是否有变更
	 */
	private Boolean isChange;
	/**
	 * 数据包路径以及版本号
	 */
	private List<ApiFileVO> files;
	
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
	public Boolean getIsChange() {
		return isChange;
	}
	public void setIsChange(Boolean isChange) {
		this.isChange = isChange;
	}
	public List<ApiFileVO> getFiles() {
		return files;
	}
	public void setFiles(List<ApiFileVO> files) {
		this.files = files;
	}
	@Override
	public String toString() {
		return "AppDataUpdateVO [mallId=" + mallId + ", terminalId="
				+ terminalId + ", isChange=" + isChange + ", files=" + files
				+ "]";
	}
	
}
