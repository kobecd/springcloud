package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class CustomCategoryVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	private String level;
	private String mallId;
	private String name;
	private String parentId;
	private List<String> categorysId;
	private List<CustomCategoryVO> categorys;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getParentId() {
		return parentId;
	}
	public void setParentId(String parentId) {
		this.parentId = parentId;
	}
	public List<String> getCategorysId() {
		return categorysId;
	}
	public void setCategorysId(List<String> categorysId) {
		this.categorysId = categorysId;
	}
	public List<CustomCategoryVO> getCategorys() {
		return categorys;
	}
	public void setCategorys(List<CustomCategoryVO> categorys) {
		this.categorys = categorys;
	}
	@Override
	public String toString() {
		return "CustomCategoryVO [id=" + id + ", level=" + level + ", mallId="
				+ mallId + ", name=" + name + ", parentId=" + parentId
				+ ", categorysId=" + categorysId + ", categorys=" + categorys
				+ "]";
	}
	
	
}
