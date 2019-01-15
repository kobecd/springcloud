package com.rongyi.easy.smart.param;

import java.util.Date;
import java.util.List;

/**
 * Created by yandong on 2017/12/21.
 */
public class ScheduleQueryParam extends BaseParam {

    private Integer machineId;

    private Integer groupId;

    private Integer deviceType; //1 设备排期， 2 组排期

    private Integer deviceId; // 设备id， 或者排期id

    private Date startDate;

    private Date endDate;

    private Date beforeStartDate;

    private Date afterStartDate;

    private Date beforeEndDate;

    private Date afterEndDate;

    private String startTimeStr;

    private String endTimeStr;

    private Integer type;

    private List<Integer> stateList;

    private Integer scheduleId;//排期id

    private Integer needDealSchedule;//是否需要处理按时段查询的结果

    private boolean queryIntersection = false; //判断是否根据时间交集查询

    private String name;//设备或者设备组的名称

    private List<Integer> machineIdList;
    
    private String keyWord;//设备名称或分组名称
    
    private Integer layoutId;//应用ID
    
    public List<Integer> getMachineIdList() {
        return machineIdList;
    }

    public void setMachineIdList(List<Integer> machineIdList) {
        this.machineIdList = machineIdList;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Date getBeforeStartDate() {
        return beforeStartDate;
    }

    public void setBeforeStartDate(Date beforeStartDate) {
        this.beforeStartDate = beforeStartDate;
    }

    public Date getAfterStartDate() {
        return afterStartDate;
    }

    public void setAfterStartDate(Date afterStartDate) {
        this.afterStartDate = afterStartDate;
    }

    public Date getBeforeEndDate() {
        return beforeEndDate;
    }

    public void setBeforeEndDate(Date beforeEndDate) {
        this.beforeEndDate = beforeEndDate;
    }

    public Date getAfterEndDate() {
        return afterEndDate;
    }

    public void setAfterEndDate(Date afterEndDate) {
        this.afterEndDate = afterEndDate;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getStartTimeStr() {
        return startTimeStr;
    }

    public void setStartTimeStr(String startTimeStr) {
        this.startTimeStr = startTimeStr;
    }

    public String getEndTimeStr() {
        return endTimeStr;
    }

    public void setEndTimeStr(String endTimeStr) {
        this.endTimeStr = endTimeStr;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public boolean isQueryIntersection() {
        return queryIntersection;
    }

    public List<Integer> getStateList() {
        return stateList;
    }

    public Integer getNeedDealSchedule() {
        return needDealSchedule;
    }

    public void setNeedDealSchedule(Integer needDealSchedule) {
        this.needDealSchedule = needDealSchedule;
    }

    public void setStateList(List<Integer> stateList) {
        this.stateList = stateList;
    }

    public void setQueryIntersection(boolean queryIntersection) {
        this.queryIntersection = queryIntersection;
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

    public Integer getScheduleId() {
        return scheduleId;
    }

    public void setScheduleId(Integer scheduleId) {
        this.scheduleId = scheduleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getKeyWord() {
		return keyWord;
	}

	public void setKeyWord(String keyWord) {
		this.keyWord = keyWord;
	}

	public Integer getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(Integer layoutId) {
		this.layoutId = layoutId;
	}

	@Override
	public String toString() {
		return super.toString() + "ScheduleQueryParam [machineId=" + machineId + ", groupId="
				+ groupId + ", deviceType=" + deviceType + ", deviceId="
				+ deviceId + ", startDate=" + startDate + ", endDate="
				+ endDate + ", beforeStartDate=" + beforeStartDate
				+ ", afterStartDate=" + afterStartDate + ", beforeEndDate="
				+ beforeEndDate + ", afterEndDate=" + afterEndDate
				+ ", startTimeStr=" + startTimeStr + ", endTimeStr="
				+ endTimeStr + ", type=" + type + ", stateList=" + stateList
				+ ", scheduleId=" + scheduleId + ", needDealSchedule="
				+ needDealSchedule + ", queryIntersection=" + queryIntersection
				+ ", name=" + name + ", machineIdList=" + machineIdList
				+ ", keyWord=" + keyWord + ", layoutId=" + layoutId + "]";
	}

	

	
}
