package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.List;

/**
 * 屏端数据更新入参
 * @author user
 *
 */
public class AppUpdateDateParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String baseVersion;//基础服务的版本号
	private String mallId;//商场id
	private String terminalId;//设备编号
	private Integer dataVersion;//数据版本号
	private List<AppParam> app;
	
	public String getBaseVersion() {
		return baseVersion;
	}
	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
	}
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
	public List<AppParam> getApp() {
		return app;
	}
	public void setApp(List<AppParam> app) {
		this.app = app;
	}
	public Integer getDataVersion() {
		return dataVersion;
	}
	public void setDataVersion(Integer dataVersion) {
		this.dataVersion = dataVersion;
	}
	@Override
	public String toString() {
		return "AppUpdateDateParam [baseVersion=" + baseVersion + ", mallId="
				+ mallId + ", terminalId=" + terminalId + ", dataVersion="
				+ dataVersion + ", app=" + app + "]";
	}
	
}
