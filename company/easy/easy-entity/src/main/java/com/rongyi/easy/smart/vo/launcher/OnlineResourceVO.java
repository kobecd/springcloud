package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * 安卓版增量更新资源存放类
 * @author user
 *
 */
public class OnlineResourceVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 图片列表
	 */
	private List<String> picList = new ArrayList<String>();
	
	/**
	 * 地图列表
	 */
	private List<String> mapList = new ArrayList<String>();
	
	/**
	 * 视频列表
	 */
	private List<String> videoList = new ArrayList<String>();
	
	/**
	 * 游戏列表
	 */
	private List<String> flashList = new ArrayList<String>();
	
	/**
	 * 删除的图片列表
	 */
	private List<String> delPicList = new ArrayList<String>();
	
	/**
	 * 删除的地图列表
	 */
	private List<String> delMapList = new ArrayList<String>();
	/**
	 * 删除的视频列表
	 */
	private List<String> delVideoList = new ArrayList<String>();
	/**
	 * 删除的游戏列表
	 */
	private List<String> delFlashList = new ArrayList<String>();

	public List<String> getPicList() {
		return picList;
	}

	public void setPicList(List<String> picList) {
		this.picList = picList;
	}

	public List<String> getMapList() {
		return mapList;
	}

	public void setMapList(List<String> mapList) {
		this.mapList = mapList;
	}

	public List<String> getVideoList() {
		return videoList;
	}

	public void setVideoList(List<String> videoList) {
		this.videoList = videoList;
	}

	public List<String> getDelPicList() {
		return delPicList;
	}

	public void setDelPicList(List<String> delPicList) {
		this.delPicList = delPicList;
	}

	public List<String> getDelMapList() {
		return delMapList;
	}

	public void setDelMapList(List<String> delMapList) {
		this.delMapList = delMapList;
	}

	public List<String> getDelVideoList() {
		return delVideoList;
	}

	public void setDelVideoList(List<String> delVideoList) {
		this.delVideoList = delVideoList;
	}

	public List<String> getFlashList() {
		return flashList;
	}

	public void setFlashList(List<String> flashList) {
		this.flashList = flashList;
	}

	public List<String> getDelFlashList() {
		return delFlashList;
	}

	public void setDelFlashList(List<String> delFlashList) {
		this.delFlashList = delFlashList;
	}

	@Override
	public String toString() {
		return "OnlineResourceVO [picList=" + picList + ", mapList=" + mapList
				+ ", videoList=" + videoList + ", flashList=" + flashList
				+ ", delPicList=" + delPicList + ", delMapList=" + delMapList
				+ ", delVideoList=" + delVideoList + ", delFlashList="
				+ delFlashList + "]";
	}

	
}
