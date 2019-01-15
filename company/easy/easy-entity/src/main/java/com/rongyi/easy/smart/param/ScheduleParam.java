package com.rongyi.easy.smart.param;

import com.rongyi.easy.smart.entity.DeviceSchedule;

/**
 * Created by yandong on 2017/12/21.
 */
public class ScheduleParam extends DeviceSchedule{

    private String startDateStr;
    private String endDateStr;

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

    @Override
    public String toString() {
        return "ScheduleParam{" +
                "startDateStr='" + startDateStr + '\'' +
                ", endDateStr='" + endDateStr + '\'' +
                "} " + super.toString();
    }
}
