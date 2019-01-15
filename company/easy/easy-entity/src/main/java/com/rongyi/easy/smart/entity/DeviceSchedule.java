package com.rongyi.easy.smart.entity;

import java.util.Date;

/**
 * Created by yandong on 2017/12/21.
 */
public class DeviceSchedule extends BaseEntity{

    private Integer id;
    private String mallId;
    private Date startDate;
    private Date endDate;
    private Integer startHour;
    private Integer endHour;
    private String week;
    private Integer state;
    private Integer type;
    private Integer layoutId;
    private Integer caseId;
    private Integer deviceId;
    private Integer deviceType; //1 设备， 2 设备组
    private Integer groupScheduleId;//组排期id

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

    public String getWeek() {
        return week;
    }

    public void setWeek(String week) {
        this.week = week;
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

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public Integer getGroupScheduleId() {
        return groupScheduleId;
    }

    public void setGroupScheduleId(Integer groupScheduleId) {
        this.groupScheduleId = groupScheduleId;
    }

    @Override
    public String toString() {
        return "DeviceSchedule{" +
                "id=" + id +
                ", mallId='" + mallId + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", startHour=" + startHour +
                ", endHour=" + endHour +
                ", week='" + week + '\'' +
                ", state=" + state +
                ", type=" + type +
                ", layoutId=" + layoutId +
                ", caseId=" + caseId +
                ", deviceId=" + deviceId +
                ", deviceType=" + deviceType +
                ", groupScheduleId=" + groupScheduleId +
                "} " + super.toString();
    }
}
