package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class FloorVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String id;//楼层id
	private Integer sort;//排序
	
	/**
     * 楼层名字
     */
    private String name;

    /**
     * 楼层在线图片资源地址
     */
    private String picture;

    /**
     * 楼层本地图片资源相对路径
     */
    private String localPicture;

    /**
     * 楼层地图导航在线图片资源地址
     */
    private String navPicture;

    /**
     * 楼层地图导航本地图片资源相对路径
     */
    private String localNavPicture;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Integer getSort() {
		return sort;
	}

	public void setSort(Integer sort) {
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

	public String getNavPicture() {
		return navPicture;
	}

	public void setNavPicture(String navPicture) {
		this.navPicture = navPicture;
	}

	public String getLocalNavPicture() {
		return localNavPicture;
	}

	public void setLocalNavPicture(String localNavPicture) {
		this.localNavPicture = localNavPicture;
	}

	@Override
	public String toString() {
		return "FloorVO [id=" + id + ", sort=" + sort + ", name=" + name
				+ ", picture=" + picture + ", localPicture=" + localPicture
				+ ", navPicture=" + navPicture + ", localNavPicture="
				+ localNavPicture + "]";
	}
    
		
}
