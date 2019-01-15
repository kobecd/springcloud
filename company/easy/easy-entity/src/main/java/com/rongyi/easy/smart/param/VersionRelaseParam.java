package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.List;

/**
 * 版本发布参数
 * @author user
 *
 */
public class VersionRelaseParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer id;//版本列表对用的id
	private String name;//应用名
	private String version;//应用版本
	private Integer type;//版本类型  1 基础服务,2 标准版,3 定制版
	private Integer relaseType;//1全发布，2指定商场发布（灰度发布）
	private List<String> mallIdList;//商场id集合
	private String createBy;//
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getVersion() {
		return version;
	}
	public void setVersion(String version) {
		this.version = version;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public Integer getRelaseType() {
		return relaseType;
	}
	public void setRelaseType(Integer relaseType) {
		this.relaseType = relaseType;
	}
	public List<String> getMallIdList() {
		return mallIdList;
	}
	public void setMallIdList(List<String> mallIdList) {
		this.mallIdList = mallIdList;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	@Override
	public String toString() {
		return "VersionRelaseParam [id=" + id + ", name=" + name + ", version="
				+ version + ", type=" + type + ", relaseType=" + relaseType
				+ ", mallIdList=" + mallIdList + ", createBy=" + createBy + "]";
	}
	
}
