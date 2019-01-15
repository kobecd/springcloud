package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.Date;

public class IncrementDataParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;//商场id
	private Integer caseId;//设备对应的模版id
	private String terminalId;//设备编号
	private String md5;//md5
	private Integer status;//状态 0：打包中 1：打包完成 2：打包失败
	private Integer type;//1：软件自身更新2：前端更新3:数据更新 4:安装包 5:广告
	private Integer version;//数据包对应的版本号
	private String packUrl;//包路径
	private String reason;//失败原因
	private Integer installStatus;//APP更新状态:0未更新，1已更新
	private Date createAt;
	private Date updateAt;
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public Integer getCaseId() {
		return caseId;
	}
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getMd5() {
		return md5;
	}
	public void setMd5(String md5) {
		this.md5 = md5;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getVersion() {
		return version;
	}
	public void setVersion(Integer version) {
		this.version = version;
	}
	public String getPackUrl() {
		return packUrl;
	}
	public void setPackUrl(String packUrl) {
		this.packUrl = packUrl;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getInstallStatus() {
		return installStatus;
	}
	public void setInstallStatus(Integer installStatus) {
		this.installStatus = installStatus;
	}
	@Override
	public String toString() {
		return "IncrementDataParam [mallId=" + mallId + ", caseId=" + caseId
				+ ", terminalId=" + terminalId + ", md5=" + md5 + ", status="
				+ status + ", type=" + type + ", version=" + version
				+ ", packUrl=" + packUrl + ", reason=" + reason
				+ ", installStatus=" + installStatus + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + "]";
	}
	
}
