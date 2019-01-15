package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class UpgradeWholeLogVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//
    private String mallId;//商场id
    private Integer type;//包类型
    private Integer version;//版本号
    private String remark;//备注
    private Integer status;//打包状态
    private String packPath;//包路径
    private String createBy;//创建人账号
    private String createAt;//创建时间
    private String updateAt;//修改时间
    private String mallName;//商场名称
    private String reason;//失败原因
    
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
	public String getCreateAt() {
		return createAt;
	}
	public void setCreateAt(String createAt) {
		this.createAt = createAt;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	@Override
	public String toString() {
		return "UpgradeWholeLogVO [id=" + id + ", mallId=" + mallId + ", type="
				+ type + ", version=" + version + ", remark=" + remark
				+ ", status=" + status + ", packPath=" + packPath
				+ ", createBy=" + createBy + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + ", mallName=" + mallName
				+ ", reason=" + reason + "]";
	}
    
}
