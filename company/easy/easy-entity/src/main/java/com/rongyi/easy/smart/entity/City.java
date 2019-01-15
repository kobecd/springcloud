package com.rongyi.easy.smart.entity;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/24.
 */
public class City implements Serializable{

    private String city;
    private String province;
    private Integer cityId;
    private Integer provinceId;

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public Integer getCityId() {
        return cityId;
    }

    public void setCityId(Integer cityId) {
        this.cityId = cityId;
    }

    public Integer getProvinceId() {
        return provinceId;
    }

    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }
}
