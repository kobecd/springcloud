package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;

public class TemplateScheduleVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 排期表ID
	 */
	private int scheduleId;
	/**
	 * 模板ID
	 */
	private String id;
	/**
	 * 模板名称
	 */
	private String deviceModule;
	/**
	 * 应用APPID
	 */
	private String appId;
	/**
	 * 后台应用表ID
	 */
	private String layoutId;
	/**
	 * 开始时间
	 */
	private String startTime;
	/**
	 * 结束时间
	 */
	private String endTime;
	
	
	public int getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getDeviceModule() {
		return deviceModule;
	}
	public void setDeviceModule(String deviceModule) {
		this.deviceModule = deviceModule;
	}
	public String getAppId() {
		return appId;
	}
	public void setAppId(String appId) {
		this.appId = appId;
	}
	public String getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	@Override
	public String toString() {
		return "TemplateScheduleVO [scheduleId=" + scheduleId + ", id=" + id
				+ ", deviceModule=" + deviceModule + ", appId=" + appId
				+ ", layoutId=" + layoutId + ", startTime=" + startTime
				+ ", endTime=" + endTime + "]";
	}
	
}
