package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class PublicFacilityVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * ID
     */
	private String id;
	/**
     * 排序字段 越小越靠前
     */
	private int sort;
	/**
     * 公共设施名字
     */
    private String name;

    /**
     * 公共设施在线图片资源地址 PNG格式图片
     */
    private String picture;

    /**
     * 公共设施本地图片资源相对路径
     */
    private String localPicture;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPicture() {
		return picture;
	}

	public void setPicture(String picture) {
		this.picture = picture;
	}

	public String getLocalPicture() {
		return localPicture;
	}

	public void setLocalPicture(String localPicture) {
		this.localPicture = localPicture;
	}

	@Override
	public String toString() {
		return "PublicFacilityVO [id=" + id + ", sort=" + sort + ", name="
				+ name + ", picture=" + picture + ", localPicture="
				+ localPicture + "]";
	}
    
}
