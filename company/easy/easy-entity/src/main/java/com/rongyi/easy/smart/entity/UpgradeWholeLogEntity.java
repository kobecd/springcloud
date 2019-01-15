package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

public class UpgradeWholeLogEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String mallId;

    private Integer type;

    private Integer version;

    private String md5sum;

    private Integer num;

    private String remark;

    private Integer status;

    private Integer deployStatus;

    private String reason;

    private String packPath;

    private Integer hasAd;

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

    public Integer getNum() {
        return num;
    }

    public void setNum(Integer num) {
        this.num = num;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getDeployStatus() {
        return deployStatus;
    }

    public void setDeployStatus(Integer deployStatus) {
        this.deployStatus = deployStatus;
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

    public Integer getHasAd() {
        return hasAd;
    }

    public void setHasAd(Integer hasAd) {
        this.hasAd = hasAd;
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

	@Override
	public String toString() {
		return "UpgradeWholeLogEntity [id=" + id + ", mallId=" + mallId
				+ ", type=" + type + ", version=" + version + ", md5sum="
				+ md5sum + ", num=" + num + ", remark=" + remark + ", status="
				+ status + ", deployStatus=" + deployStatus + ", reason="
				+ reason + ", packPath=" + packPath + ", hasAd=" + hasAd
				+ ", createBy=" + createBy + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + "]";
	}
}