package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

import com.rongyi.easy.smart.vo.AdvertVO;

/**
 * Created by yandong on 2017/10/16.
 */
public class CaseLayerSourceRef implements Serializable {

    private Integer sourceId;
    private Integer layerId;

    private Date startTime;

    private String startTimeStr;

    private Date endTime;

    private String endTimeStr;

    private Integer interval;//图片轮播时长
    
    private Integer index;//素材在控件中的顺序

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

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getLayerId() {
        return layerId;
    }

    public void setLayerId(Integer layerId) {
        this.layerId = layerId;
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
		return "CaseLayerSourceRef [sourceId=" + sourceId + ", layerId="
				+ layerId + ", startTime=" + startTime + ", startTimeStr="
				+ startTimeStr + ", endTime=" + endTime + ", endTimeStr="
				+ endTimeStr + ", interval=" + interval + ", index=" + index
				+ "]";
	}
	
}
