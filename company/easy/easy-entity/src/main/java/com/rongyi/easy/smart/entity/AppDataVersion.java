package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by yandong on 2018/1/12.
 */
public class AppDataVersion implements Serializable {
    private static final long serialVersionUID = -253852888350744863L;

    private Integer id;

    private String mallId;

    private Integer machineId;

    private Integer dataVersion;

    private Integer appVersion;

    private Integer appId;

    private Date createAt;

    private Date updateAt;

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

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Integer getAppVersion() {
        return appVersion;
    }

    public void setAppVersion(Integer appVersion) {
        this.appVersion = appVersion;
    }

    public Integer getAppId() {
        return appId;
    }

    public void setAppId(Integer appId) {
        this.appId = appId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }

    @Override
    public String toString() {
        return "AppDataVersion{" +
                "id=" + id +
                ", mallId='" + mallId + '\'' +
                ", machineId=" + machineId +
                ", dataVersion=" + dataVersion +
                ", appVersion=" + appVersion +
                ", appId=" + appId +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
