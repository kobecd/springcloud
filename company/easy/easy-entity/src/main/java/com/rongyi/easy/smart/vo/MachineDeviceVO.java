package com.rongyi.easy.smart.vo;

/**
 * Created by yandong on 2017/12/29.
 */
public class MachineDeviceVO {

    private Integer deviceId;

    private String name;

    public Integer getDeviceId() {
        return deviceId;
    }

    public void setDeviceId(Integer deviceId) {
        this.deviceId = deviceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "MachineDeviceVO{" +
                "deviceId=" + deviceId +
                ", name='" + name + '\'' +
                '}';
    }
}
