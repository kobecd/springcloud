package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.Source;

import java.util.Date;

/**
 * Created by yandong on 2017/10/19.
 */
public class SourceVO extends Source {

    private Integer layerId;

    private Date startTime;

    private String startTimeStr;

    private Date endTime;

    private String endTimeStr;

    private Integer interval;
    
    private Integer index;//默认100  素材在控件中的排序

    public Date getStartTime() {
        return startTime;
    }

    public void setStartTime(Date startTime) {
        this.startTime = startTime;
    }

    public Date getEndTime() {
        return endTime;
    }

    public void setEndTime(Date endTime) {
        this.endTime = endTime;
    }

    public Integer getLayerId() {
        return layerId;
    }

    public void setLayerId(Integer layerId) {
        this.layerId = layerId;
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

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

	public Integer getIndex() {
		return index;
	}

	public void setIndex(Integer index) {
		this.index = index;
	}

	@Override
	public String toString() {
		return "SourceVO [layerId=" + layerId + ", startTime=" + startTime
				+ ", startTimeStr=" + startTimeStr + ", endTime=" + endTime
				+ ", endTimeStr=" + endTimeStr + ", interval=" + interval
				+ ", index=" + index + "]";
	}
}
