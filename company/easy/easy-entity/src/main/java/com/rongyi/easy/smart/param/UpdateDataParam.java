package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.Date;

public class UpdateDataParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String mallId;
	private Integer version;
	private String md5sum;
	private String packPath;
	private Integer status;
	private Date updateAt;//
	private String reason;//失败原因
	
	private Integer id;
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
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
	public String getPackPath() {
		return packPath;
	}
	public void setPackPath(String packPath) {
		this.packPath = packPath;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(Date updateAt) {
		this.updateAt = updateAt;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	@Override
	public String toString() {
		return "UpdateDataParam [mallId=" + mallId + ", version=" + version
				+ ", md5sum=" + md5sum + ", packPath=" + packPath + ", status="
				+ status + ", updateAt=" + updateAt + ", reason=" + reason
				+ ", id=" + id + "]";
	}
	
}
