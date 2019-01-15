package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/17.
 */
public class MachineCaseVO implements Serializable{

    private Integer id;
    private String name;
    private String address;
    private String resolution;
    private String netWorkState;
    private String appName;
    private String machineCode;
    private Integer osType;

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getMachineCode() {
        return machineCode;
    }

    public void setMachineCode(String machineCode) {
        this.machineCode = machineCode;
    }

    public Integer getOsType() {
        return osType;
    }

    public void setOsType(Integer osType) {
        this.osType = osType;
    }

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

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public String getNetWorkState() {
        return netWorkState;
    }

    public void setNetWorkState(String netWorkState) {
        this.netWorkState = netWorkState;
    }

	@Override
	public String toString() {
		return "MachineCaseVO [id=" + id + ", name=" + name + ", address="
				+ address + ", resolution=" + resolution + ", netWorkState="
				+ netWorkState + ", appName=" + appName + ", machineCode="
				+ machineCode + ", osType=" + osType + "]";
	}
    
}
