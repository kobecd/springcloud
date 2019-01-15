package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.Date;

public class MonitorVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String mallId;//商场id
	private String mallName;//商场名称
	private String applyName;//应用名称
	private String appId;//APKId
	private String version;//发布版本
	private Date createAt;//发布时间
	private String updateAt;//更新时间
	private Integer status;//状态
	private Integer totalMachineCount;//总机器数
	private Integer deployCount;//部署机器数
	private Integer type;//1 基础服务,2 标准版,3 定制版
	private Integer osType;//系统类型 1:安卓, 2:windows

	public Integer getOsType(){
		return osType;
	}
	public void setOsType(Integer osType){
		this.osType = osType;
	}
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
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getApplyName() {
		return applyName;
	}
	public void setApplyName(String applyName) {
		this.applyName = applyName;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Integer getTotalMachineCount() {
		return totalMachineCount;
	}
	public void setTotalMachineCount(Integer totalMachineCount) {
		this.totalMachineCount = totalMachineCount;
	}
	public Integer getDeployCount() {
		return deployCount;
	}
	public void setDeployCount(Integer deployCount) {
		this.deployCount = deployCount;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	@Override
	public String toString() {
		return "MonitorVO [id=" + id + ", mallId=" + mallId + ", mallName="
				+ mallName + ", applyName=" + applyName + ", appId=" + appId
				+ ", version=" + version + ", createAt=" + createAt
				+ ", updateAt=" + updateAt + ", status=" + status
				+ ", totalMachineCount=" + totalMachineCount + ", deployCount="
				+ deployCount + ", type=" + type + "]";
	}
	
}
