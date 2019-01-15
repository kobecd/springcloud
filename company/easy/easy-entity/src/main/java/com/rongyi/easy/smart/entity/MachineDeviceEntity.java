package com.rongyi.easy.smart.entity;

import java.io.Serializable;

public class MachineDeviceEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String os;

    private String osVersion;

    private String mainboard;

    private String buildId;

    private String resolution;

    private Short ram;

    private Short networkState;

    private String networkType;

    private String mac;

    private String ip;

    private String sd;

    private Byte bluetooth;

    private Byte camera;

    private Integer machineId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getOs() {
        return os;
    }

    public void setOs(String os) {
        this.os = os;
    }

    public String getOsVersion() {
        return osVersion;
    }

    public void setOsVersion(String osVersion) {
        this.osVersion = osVersion;
    }

    public String getMainboard() {
        return mainboard;
    }

    public void setMainboard(String mainboard) {
        this.mainboard = mainboard;
    }

    public String getBuildId() {
        return buildId;
    }

    public void setBuildId(String buildId) {
        this.buildId = buildId;
    }

    public String getResolution() {
        return resolution;
    }

    public void setResolution(String resolution) {
        this.resolution = resolution;
    }

    public Short getRam() {
        return ram;
    }

    public void setRam(Short ram) {
        this.ram = ram;
    }

    public Short getNetworkState() {
        return networkState;
    }

    public void setNetworkState(Short networkState) {
        this.networkState = networkState;
    }

    public String getNetworkType() {
        return networkType;
    }

    public void setNetworkType(String networkType) {
        this.networkType = networkType;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getSd() {
        return sd;
    }

    public void setSd(String sd) {
        this.sd = sd;
    }

    public Byte getBluetooth() {
        return bluetooth;
    }

    public void setBluetooth(Byte bluetooth) {
        this.bluetooth = bluetooth;
    }

    public Byte getCamera() {
        return camera;
    }

    public void setCamera(Byte camera) {
        this.camera = camera;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }
}