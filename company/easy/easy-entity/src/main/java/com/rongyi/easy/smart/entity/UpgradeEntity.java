package com.rongyi.easy.smart.entity;

import java.util.Date;

public class UpgradeEntity {
    private Integer id;

    private String mallId;

    private String terminalId;

    private Integer caseId;

    private Integer type;
    
    private Integer appVersion;//请求的数据版本号
    
    private Integer version;

    private String md5sum;

    private Integer status;//打包状态 0：打包中 1：打包完成 2：打包失败
    
    private Integer installStatus;//app更新状态 0未更新,1 已更新

    private String reason;

    private String packPath;

    private String createBy;

    private Date createAt;

    private Date updateAt;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
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

    public String getMd5sum() {
        return md5sum;
    }

    public void setMd5sum(String md5sum) {
        this.md5sum = md5sum;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getPackPath() {
        return packPath;
    }

    public void setPackPath(String packPath) {
        this.packPath = packPath;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
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

	public Integer getAppVersion() {
		return appVersion;
	}

	public void setAppVersion(Integer appVersion) {
		this.appVersion = appVersion;
	}

	@Override
	public String toString() {
		return "UpgradeEntity [id=" + id + ", mallId=" + mallId
				+ ", terminalId=" + terminalId + ", caseId=" + caseId
				+ ", type=" + type + ", appVersion=" + appVersion
				+ ", version=" + version + ", md5sum=" + md5sum + ", status="
				+ status + ", installStatus=" + installStatus + ", reason="
				+ reason + ", packPath=" + packPath + ", createBy=" + createBy
				+ ", createAt=" + createAt + ", updateAt=" + updateAt + "]";
	}
	
}