package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yandong on 2017/11/8.
 */
public class Advertisement implements Serializable {

    private Integer id;

    private String name;//名称

    private Integer type;//广告类型 banner 等

    private Integer style;//样式 图片， 视频等

    private Date startTime;//投放开放时间点

    private Date endTime;//投放结束时间点

    private Integer interval;//播放时长， 样式为图片时有效

    private Integer state;//状态0 删除， 1 正常

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStyle() {
        return style;
    }

    public void setStyle(Integer style) {
        this.style = style;
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

    public Integer getInterval() {
        return interval;
    }

    public void setInterval(Integer interval) {
        this.interval = interval;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    @Override
    public String toString() {
        return "Advertisement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", style=" + style +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", interval=" + interval +
                ", state=" + state +
                '}';
    }
}
