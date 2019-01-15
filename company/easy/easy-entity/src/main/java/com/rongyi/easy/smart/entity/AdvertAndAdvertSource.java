package com.rongyi.easy.smart.entity;

public class AdvertAndAdvertSource {

    private String name;//广告名

    private Integer type;//广告类型 1:内部广告,2:外部广告

    private String mallId;//商场id

    private Integer adType;//广告展示类型 1:banner,2:其他

    private Integer adStyle;//广告样式 1:图片,2视频

    private Integer sourceId;//素材id

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

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }
}
