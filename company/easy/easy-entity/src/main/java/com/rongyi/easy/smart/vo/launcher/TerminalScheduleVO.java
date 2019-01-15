package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;
import java.util.Date;

/**
 * 设备排期信息 VO
 * @author user
 *
 */
public class TerminalScheduleVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//排期表ID
	private String machineId;//设备id
	private String mallId;//商场id
	private Date startDate;//开始时间
	private Date endDate;//结束时间
	private Integer startHour;//某天排期开始时间
	private Integer endHour;//某天排期结束时间
	private String weeks;//周期性排期， 指当前时间段内的周几播放
	private Integer layoutId;//应用模块id
	private Integer caseId;//模板id
	private Integer state;//状态, 1 正常， 0 删除， 2 天加到组的时候删除， 3 重新排期类型不同时删除， 4 停止
	private Integer type;//排期类型，1 按时段设置， 2 按排期表设置
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getMachineId() {
		return machineId;
	}
	public void setMachineId(String machineId) {
		this.machineId = machineId;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
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
	public String getWeeks() {
		return weeks;
	}
	public void setWeeks(String weeks) {
		this.weeks = weeks;
	}
	public Integer getLayoutId() {
		return layoutId;
	}
	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}
	public Integer getCaseId() {
		return caseId;
	}
	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "TerminalScheduleVO [id=" + id + ", machineId=" + machineId
				+ ", mallId=" + mallId + ", startDate=" + startDate
				+ ", endDate=" + endDate + ", startHour=" + startHour
				+ ", endHour=" + endHour + ", weeks=" + weeks + ", layoutId="
				+ layoutId + ", caseId=" + caseId + ", state=" + state
				+ ", type=" + type + "]";
	}
	
}
