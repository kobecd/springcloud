package com.rongyi.easy.smart.vo.rollScreen;

import java.util.List;

/**
 * 排期设备对象
 * Created by yandong on 2017/12/27.
 */
public class ScheduleDeviceVO {

    private Integer deviceId;
    private String name;
    private Integer deviceType;
    private List<ScheduleDeviceVO> childList;
    private Integer scheduleGroupId;

    public Integer getScheduleGroupId() {
        return scheduleGroupId;
    }

    public void setScheduleGroupId(Integer scheduleGroupId) {
        this.scheduleGroupId = scheduleGroupId;
    }

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
    }

    public List<ScheduleDeviceVO> getChildList() {
        return childList;
    }

    public void setChildList(List<ScheduleDeviceVO> childList) {
        this.childList = childList;
    }

    @Override
    public String toString() {
        return "ScheduleDeviceVO{" +
                "deviceId=" + deviceId +
                ", name='" + name + '\'' +
                ", deviceType=" + deviceType +
                ", childList=" + childList +
                ", scheduleGroupId=" + scheduleGroupId +
                '}';
    }
}
