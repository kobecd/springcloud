package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class MallUpdateParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//商场id
	private String appId;//应用模板ID
	private Integer caseId;//模板id
	private Integer dataVersion;//数据版本号
	private Integer apkVersion;//APK请求数据版本号
	private Integer type;//数据变更类型
	private Integer moduleId;//应用id(module表id)
	private Integer terminalId;//设备id
	private String terminalCode;//设备编号
	private String path;//数据存储路径
	private Integer oldCaseId;//上个版本对应的模板ID
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public Integer getCaseId() {
		return caseId;
	}
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	public Integer getDataVersion() {
		return dataVersion;
	}
	public void setDataVersion(Integer dataVersion) {
		this.dataVersion = dataVersion;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getApkVersion() {
		return apkVersion;
	}
	public void setApkVersion(Integer apkVersion) {
		this.apkVersion = apkVersion;
	}
	public Integer getModuleId() {
		return moduleId;
	}
	public void setModuleId(Integer moduleId) {
		this.moduleId = moduleId;
	}
	public Integer getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(Integer terminalId) {
		this.terminalId = terminalId;
	}
	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	public String getPath() {
		return path;
	}
	public void setPath(String path) {
		this.path = path;
	}
	public Integer getOldCaseId() {
		return oldCaseId;
	}
	public void setOldCaseId(Integer oldCaseId) {
		this.oldCaseId = oldCaseId;
	}
	@Override
	public String toString() {
		return "MallUpdateParam [mallId=" + mallId + ", appId=" + appId
				+ ", caseId=" + caseId + ", dataVersion=" + dataVersion
				+ ", apkVersion=" + apkVersion + ", type=" + type
				+ ", moduleId=" + moduleId + ", terminalId=" + terminalId
				+ ", terminalCode=" + terminalCode + ", path=" + path
				+ ", oldCaseId=" + oldCaseId + "]";
	}
	
}
