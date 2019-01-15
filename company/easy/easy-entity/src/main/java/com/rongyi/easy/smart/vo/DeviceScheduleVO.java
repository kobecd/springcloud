package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.DeviceSchedule;

/**
 * Created by yandong on 2017/12/22.
 */
public class DeviceScheduleVO extends DeviceSchedule {

    private String caseName;
    private String appName;
    private String startDateStr;
    private String endDateStr;
    private String startHourStr;
    private String endHourStr;
    private String operateTimeStr;
    private String runStateStr;
    private Integer runState;
    private Integer scheduleGroupId;
    private String scheduleName;//设备或者分组名称

    public String getOperateTimeStr() {
        return operateTimeStr;
    }

    public void setOperateTimeStr(String operateTimeStr) {
        this.operateTimeStr = operateTimeStr;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public String getStartDateStr() {
        return startDateStr;
    }

    public void setStartDateStr(String startDateStr) {
        this.startDateStr = startDateStr;
    }

    public String getEndDateStr() {
        return endDateStr;
    }

    public void setEndDateStr(String endDateStr) {
        this.endDateStr = endDateStr;
    }

    public String getStartHourStr() {
        return startHourStr;
    }

    public void setStartHourStr(String startHourStr) {
        this.startHourStr = startHourStr;
    }

    public String getEndHourStr() {
        return endHourStr;
    }

    public void setEndHourStr(String endHourStr) {
        this.endHourStr = endHourStr;
    }

    public String getRunStateStr() {
        return runStateStr;
    }

    public void setRunStateStr(String runStateStr) {
        this.runStateStr = runStateStr;
    }

    public Integer getRunState() {
        return runState;
    }

    public void setRunState(Integer runState) {
        this.runState = runState;
    }

    public Integer getScheduleGroupId() {
        return scheduleGroupId;
    }

    public void setScheduleGroupId(Integer scheduleGroupId) {
        this.scheduleGroupId = scheduleGroupId;
    }

	public String getScheduleName() {
		return scheduleName;
	}

	public void setScheduleName(String scheduleName) {
		this.scheduleName = scheduleName;
	}

	@Override
	public String toString() {
		return super.toString() + "DeviceScheduleVO [caseName=" + caseName + ", appName="
				+ appName + ", startDateStr=" + startDateStr + ", endDateStr="
				+ endDateStr + ", startHourStr=" + startHourStr
				+ ", endHourStr=" + endHourStr + ", operateTimeStr="
				+ operateTimeStr + ", runStateStr=" + runStateStr
				+ ", runState=" + runState + ", scheduleGroupId="
				+ scheduleGroupId + ", scheduleName=" + scheduleName + "]";
	}

    
}
