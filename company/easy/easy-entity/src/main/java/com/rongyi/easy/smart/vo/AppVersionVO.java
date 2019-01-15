package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.Date;

public class AppVersionVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//
	private String version;//版本号
	private String name;//应用名
	private String appId; //应用id
	private String packUrl;//包路径
	private Integer type;//类型
	private String createBy;//创建人
	private Integer status;//状态
	private Date createAt;//创建时间
	private String createTime;//创建时间
	private Integer totalCount;//总数
	private Integer successCount;//已完成数量
	private Integer osType;//系统类型 1:安卓, 2:windows
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPackUrl() {
		return packUrl;
	}
	public void setPackUrl(String packUrl) {
		this.packUrl = packUrl;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public Integer getTotalCount() {
		return totalCount;
	}
	public void setTotalCount(Integer totalCount) {
		this.totalCount = totalCount;
	}
	public Integer getSuccessCount() {
		return successCount;
	}
	public void setSuccessCount(Integer successCount) {
		this.successCount = successCount;
	}
	public Integer getOsType() {
		return osType;
	}
	public void setOsType(Integer osType) {
		this.osType = osType;
	}
	@Override
	public String toString() {
		return "AppVersionVO [id=" + id + ", version=" + version + ", name="
				+ name + ", appId=" + appId + ", packUrl=" + packUrl
				+ ", type=" + type + ", createBy=" + createBy + ", status="
				+ status + ", createAt=" + createAt + ", createTime="
				+ createTime + ", totalCount=" + totalCount + ", successCount="
				+ successCount + ", osType=" + osType + "]";
	}
	
	
}
