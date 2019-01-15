package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;
import java.util.Date;
/**
 * 模板排期时间信息
 * @author user
 *
 */
public class TemplateVO implements Serializable {
	
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
	private Integer id;
	/**
	 * 商场ID
	 */
	private String mallId;
	/**
	 * 应用APPID
	 */
	private Integer appId;
	/**
	 * 开始时间
	 */
	private Date startDate;
	/**
	 * 结束时间
	 */
	private Date endDate;
	/**
	 * 某天排期开始时间
	 */
	private Integer startHour;
	/**
	 * 某天排期结束时间
	 */
	private Integer endHour;
	/**
	 * 排期类型 1 按时段设置,2 按排期表设置
	 */
	private Integer type;
	
	public TemplateVO() {
		
	}
	
	public TemplateVO(TerminalScheduleVO terminalSchedule) {
		this.scheduleId = terminalSchedule.getId();//排期表ID
		this.id = terminalSchedule.getCaseId();//模板ID
		this.mallId = terminalSchedule.getMallId();
		this.appId = terminalSchedule.getLayoutId();
		this.startDate = terminalSchedule.getStartDate();
		this.endDate = terminalSchedule.getEndDate();
		this.startHour = terminalSchedule.getStartHour();
		this.endHour = terminalSchedule.getEndHour();
		this.type = terminalSchedule.getType();
	}
	
	
	public int getScheduleId() {
		return scheduleId;
	}

	public void setScheduleId(int scheduleId) {
		this.scheduleId = scheduleId;
	}

	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public Integer getAppId() {
		return appId;
	}
	public void setAppId(Integer appId) {
		this.appId = appId;
	}
	public Date getStartDate() {
		return startDate;
	}
	public void setStartDate(Date startDate) {
		this.startDate = startDate;
	}
	public Date getEndDate() {
		return endDate;
	}
	public void setEndDate(Date endDate) {
		this.endDate = endDate;
	}
	public Integer getStartHour() {
		return startHour;
	}
	public void setStartHour(Integer startHour) {
		this.startHour = startHour;
	}
	public Integer getEndHour() {
		return endHour;
	}
	public void setEndHour(Integer endHour) {
		this.endHour = endHour;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "TemplateVO [scheduleId=" + scheduleId + ", id=" + id
				+ ", mallId=" + mallId + ", appId=" + appId + ", startDate="
				+ startDate + ", endDate=" + endDate + ", startHour="
				+ startHour + ", endHour=" + endHour + ", type=" + type + "]";
	}
	
}
