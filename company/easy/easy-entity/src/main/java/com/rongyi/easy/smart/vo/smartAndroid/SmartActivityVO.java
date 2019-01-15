package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;

public class SmartActivityVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * ID
    */
    private String id;
    
	/**
     * 活动分类ID  默认1 标准活动
     */
    private Integer categoryId;

    /**
     * 活动名字
     */
    private String name;

    /**
     * 活动内容图片网络地址
     */
    private String picture;

    /**
     * 活动内容图片本地地址
     */
    private String localPicture;
    
    /**
     * 排序字段 越小越靠前
     */
    private int sort;

    private Integer startTime;

    private Integer endTime;

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

	public Integer getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(Integer categoryId) {
		this.categoryId = categoryId;
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

	public Integer getStartTime() {
		return startTime;
	}

	public void setStartTime(Integer startTime) {
		this.startTime = startTime;
	}

	public Integer getEndTime() {
		return endTime;
	}

	public void setEndTime(Integer endTime) {
		this.endTime = endTime;
	}

	@Override
	public String toString() {
		return "SmartActivityVO{" +
				"id='" + id + '\'' +
				", categoryId=" + categoryId +
				", name='" + name + '\'' +
				", picture='" + picture + '\'' +
				", localPicture='" + localPicture + '\'' +
				", sort=" + sort +
				", startTime=" + startTime +
				", endTime=" + endTime +
				'}';
	}
}
