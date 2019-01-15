package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.List;

import com.rongyi.easy.bsoms.param.BaseParam;

public class AdvertParam extends BaseParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//广告表对应的ID
	private String name;//广告名称
	private Integer adType;//广告展示类型 1:banner,2:其他
	private Integer adStyle;//广告样式 1:图片,2视频
	private String adUrl;//广告连接地址
	private String startAt;//广告投放时段开始时间
	private String endAt;//广告投放时段结束时间
	private int broadcastTime;//广告每帧播放时长
	private List<Integer> sourceIds;//素材ID集合
	private Integer type;//广告类型 1:内部广告,2:外部广告
	private String mallId;//商场id
	private String time;//当前时间点 yyyy-MM-dd
	
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
	public Integer getAdType() {
		return adType;
	}
	public void setAdType(Integer adType) {
		this.adType = adType;
	}
	public Integer getAdStyle() {
		return adStyle;
	}
	public void setAdStyle(Integer adStyle) {
		this.adStyle = adStyle;
	}

	public String getAdUrl() {
		return adUrl;
	}

	public void setAdUrl(String adUrl) {
		this.adUrl = adUrl;
	}

	public String getStartAt() {
		return startAt;
	}
	public void setStartAt(String startAt) {
		this.startAt = startAt;
	}
	public String getEndAt() {
		return endAt;
	}
	public void setEndAt(String endAt) {
		this.endAt = endAt;
	}
	public int getBroadcastTime() {
		return broadcastTime;
	}
	public void setBroadcastTime(int broadcastTime) {
		this.broadcastTime = broadcastTime;
	}
	public List<Integer> getSourceIds() {
		return sourceIds;
	}
	public void setSourceIds(List<Integer> sourceIds) {
		this.sourceIds = sourceIds;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}

	@Override
	public String toString() {
		return "AdvertParam{" +
				"id=" + id +
				", name='" + name + '\'' +
				", adType=" + adType +
				", adStyle=" + adStyle +
				", adUrl='" + adUrl + '\'' +
				", startAt='" + startAt + '\'' +
				", endAt='" + endAt + '\'' +
				", broadcastTime=" + broadcastTime +
				", sourceIds=" + sourceIds +
				", type=" + type +
				", mallId='" + mallId + '\'' +
				", time='" + time + '\'' +
				'}';
	}

}
