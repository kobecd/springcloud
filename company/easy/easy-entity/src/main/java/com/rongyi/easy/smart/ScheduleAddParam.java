package com.rongyi.easy.smart;

import com.rongyi.easy.smart.param.BaseParam;
import com.rongyi.easy.smart.param.ScheduleParam;

import java.util.List;

/**
 * Created by yandong on 2018/1/2.
 */
public class ScheduleAddParam extends BaseParam {

    private String mallId;

    private Integer caseId;

    private Integer layoutId;

    private Integer deviceType;

    private Integer deviceId;

    private Integer type;

    private Integer isMerge;

    List<ScheduleParam> scheduleList;

    @Override
    public String getMallId() {
        return mallId;
    }

    @Override
    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    @Override
    public Integer getCaseId() {
        return caseId;
    }

    @Override
    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public Integer getDeviceType() {
        return deviceType;
    }

    public void setDeviceType(Integer deviceType) {
        this.deviceType = deviceType;
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

    public List<ScheduleParam> getScheduleList() {
        return scheduleList;
    }

    public void setScheduleList(List<ScheduleParam> scheduleList) {
        this.scheduleList = scheduleList;
    }

    public Integer getIsMerge() {
        return isMerge;
    }

    public void setIsMerge(Integer isMerge) {
        this.isMerge = isMerge;
    }

    @Override
    public String toString() {
        return "ScheduleAddParam{" +
                "mallId='" + mallId + '\'' +
                ", caseId=" + caseId +
                ", layoutId=" + layoutId +
                ", deviceType=" + deviceType +
                ", deviceId=" + deviceId +
                ", type=" + type +
                ", scheduleList=" + scheduleList +
                "} " + super.toString();
    }
}
