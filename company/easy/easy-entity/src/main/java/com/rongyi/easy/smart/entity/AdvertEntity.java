package com.rongyi.easy.smart.entity;

import java.util.Date;

public class AdvertEntity {
    private Integer id;

    private String name;//广告名

    private Integer type;//广告类型 1:内部广告,2:外部广告
    
    private String mallId;//商场id

    private Integer adType;//广告展示类型 1:banner,2:其他

    private Integer adStyle;//广告样式 1:图片,2视频

    private String adUrl;//广告外链地址

    private Integer status;//状态 1:正常,0:删除

    private Date startAt;//广告投放时段开始时间

    private Date endAt;//广告投放时段结束时间

    private Integer broadcastTime;//广告每帧播放时长

    private String createBy;//创建人

    private Date createAt;//创建时间

    private String updateBy;//修改人

    private Date updateAt;//修改时间

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
    
    public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public Integer getAdType() {
        return adType;
    }

    public void setAdType(Integer adType) {
        this.adType = adType;
    }

    public Integer getAdStyle() {
        return adStyle;
    }

    public void setAdStyle(Integer adStyle) {
        this.adStyle = adStyle;
    }

    public String getAdUrl() {
        return adUrl;
    }

    public void setAdUrl(String adUrl) {
        this.adUrl = adUrl;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Date getStartAt() {
        return startAt;
    }

    public void setStartAt(Date startAt) {
        this.startAt = startAt;
    }

    public Date getEndAt() {
        return endAt;
    }

    public void setEndAt(Date endAt) {
        this.endAt = endAt;
    }

    public Integer getBroadcastTime() {
        return broadcastTime;
    }

    public void setBroadcastTime(Integer broadcastTime) {
        this.broadcastTime = broadcastTime;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }
}