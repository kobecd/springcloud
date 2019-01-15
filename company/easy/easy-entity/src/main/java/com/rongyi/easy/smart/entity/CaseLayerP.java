package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yandong on 2017/10/25.
 */
public class CaseLayerP implements Serializable {

    private Integer id;
    private String mallId;
    private String positionLeft;
    private String positionUp;
    private String width;
    private String height;
    private String deepColor;
    private String lightColor;
    private String weatherType;
    private String timeFormat;
    private String dateFormat;
    private String is24Hour;
    private String time;
    private String sort;
    private List<String> resource;
    private List<String> localresource;
    private String resolution;
    private String url;

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

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

    public String getPositionLeft() {
        return positionLeft;
    }

    public void setPositionLeft(String positionLeft) {
        this.positionLeft = positionLeft;
    }

    public String getPositionUp() {
        return positionUp;
    }

    public void setPositionUp(String positionUp) {
        this.positionUp = positionUp;
    }

    public String getWidth() {
        return width;
    }

    public void setWidth(String width) {
        this.width = width;
    }

    public String getHeight() {
        return height;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public String getDeepColor() {
        return deepColor;
    }

    public void setDeepColor(String deepColor) {
        this.deepColor = deepColor;
    }

    public String getLightColor() {
        return lightColor;
    }

    public void setLightColor(String lightColor) {
        this.lightColor = lightColor;
    }

    public String getWeatherType() {
        return weatherType;
    }

    public void setWeatherType(String weatherType) {
        this.weatherType = weatherType;
    }

    public String getTimeFormat() {
        return timeFormat;
    }

    public void setTimeFormat(String timeFormat) {
        this.timeFormat = timeFormat;
    }

    public String getDateFormat() {
        return dateFormat;
    }

    public void setDateFormat(String dateFormat) {
        this.dateFormat = dateFormat;
    }

    public String getIs24Hour() {
        return is24Hour;
    }

    public void setIs24Hour(String is24Hour) {
        this.is24Hour = is24Hour;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public List<String> getResource() {
        return resource;
    }

    public void setResource(List<String> resource) {
        this.resource = resource;
    }

    public List<String> getLocalresource() {
        return localresource;
    }

    public void setLocalresource(List<String> localresource) {
        this.localresource = localresource;
    }
}
