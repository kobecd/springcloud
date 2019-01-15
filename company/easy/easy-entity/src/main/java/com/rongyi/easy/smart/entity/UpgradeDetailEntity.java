package com.rongyi.easy.smart.entity;

import java.util.Date;

public class UpgradeDetailEntity {
    private Integer id;

    private String mallId;//商场id
    
    private Integer applicationType;//应用类型:1,安卓标准版，2,电子易拉宝

    private Integer type;//变更数据类型

    private String changeId;//变更数据类型对应的id

    private Integer changeType;//变更类型:1,新增 2,修改 3,删除
    
    private Integer caseId;//设备变更的模板id
    
    private String appId;//设备变更的app_id
    
    private Integer scheduleId;//设备排期表ID
    
    private Integer sourceOwnerId;//资源所有者  电子易拉宝模块图层或者广告

    private Integer status;//状态

    private Integer version;//版本号

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

    public Integer getApplicationType() {
		return applicationType;
	}

	public void setApplicationType(Integer applicationType) {
		this.applicationType = applicationType;
	}

	public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public String getChangeId() {
        return changeId;
    }

    public void setChangeId(String changeId) {
        this.changeId = changeId;
    }

    public Integer getChangeType() {
        return changeType;
    }

    public void setChangeType(Integer changeType) {
        this.changeType = changeType;
    }

    public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Integer getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(Integer scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Integer getSourceOwnerId() {
		return sourceOwnerId;
	}

	public void setSourceOwnerId(Integer sourceOwnerId) {
		this.sourceOwnerId = sourceOwnerId;
	}

	public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
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

	@Override
	public String toString() {
		return "UpgradeDetailEntity [id=" + id + ", mallId=" + mallId
				+ ", applicationType=" + applicationType + ", type=" + type
				+ ", changeId=" + changeId + ", changeType=" + changeType
				+ ", caseId=" + caseId + ", appId=" + appId + ", scheduleId="
				+ scheduleId + ", sourceOwnerId=" + sourceOwnerId + ", status="
				+ status + ", version=" + version + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + "]";
	}
	
}