package com.rongyi.easy.smart.param;

import java.io.Serializable;

import com.rongyi.easy.bsoms.param.BaseParam;


/**
 * 编辑app版本号参数
 * @author user
 *
 */
public class AppVersionParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//主键id
	private String version;//版本号 1.0.0
	private Integer versionCode;//版本号
	private String name;//版本名称
	private Integer type;//版本类型:1 基础服务,2 标准版,3 定制版,4 系统服务
	private String baseVersion;//最低的基础服务版本（1和4除外）
	private String remark;//应用简介
	private String createBy;
	private String packUrl;//包路径
	private String appId;
	private String mallId;
	
	private Integer osType;//应用类型:1 android, 2 windows

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getVersionCode() {
		return versionCode;
	}
	public void setVersionCode(Integer versionCode) {
		this.versionCode = versionCode;
	}
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getBaseVersion() {
		return baseVersion;
	}
	public void setBaseVersion(String baseVersion) {
		this.baseVersion = baseVersion;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getPackUrl() {
		return packUrl;
	}
	public void setPackUrl(String packUrl) {
		this.packUrl = packUrl;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public Integer getOsType() {
		return osType;
	}

	public void setOsType(Integer osType) {
		this.osType = osType;
	}

	@Override
	public String toString() {
		return "AppVersionParam [id=" + id + ", version=" + version
				+ ", versionCode=" + versionCode + ", name=" + name + ", type="
				+ type + ", baseVersion=" + baseVersion + ", remark=" + remark
				+ ", createBy=" + createBy + ", packUrl=" + packUrl
				+ ", appId=" + appId + ", mallId=" + mallId + ", osType="
				+ osType + "]";
	}
	
}
