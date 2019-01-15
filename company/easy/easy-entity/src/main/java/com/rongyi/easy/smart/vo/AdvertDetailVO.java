package com.rongyi.easy.smart.vo;

import java.util.List;

/**
 * 广告详情VO
 * @author user
 *
 */
public class AdvertDetailVO extends AdvertVO {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private int broadcastTime;//广告每帧播放时长
	private List<AdvertSourceVO> sourceList;//素材
	
	public int getBroadcastTime() {
		return broadcastTime;
	}

	public void setBroadcastTime(int broadcastTime) {
		this.broadcastTime = broadcastTime;
	}

	public List<AdvertSourceVO> getSourceList() {
		return sourceList;
	}

	public void setSourceList(List<AdvertSourceVO> sourceList) {
		this.sourceList = sourceList;
	}

	@Override
	public String toString() {
		return super.toString() + "AdvertDetailVO [broadcastTime=" + broadcastTime
				+ ", sourceList=" + sourceList + "]";
	}
	
	
}
