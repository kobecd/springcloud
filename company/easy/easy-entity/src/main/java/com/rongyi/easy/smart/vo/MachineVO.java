package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class MachineVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//终端编号-公司自定义
	/**
	 * 设备名
	 */
	private String terminalName;
	/**
     * 商场ID
     */
    private String mallId;

    /**
     * 机器在地图中X轴坐标
     */
    private long locationX;

    /**
     * 机器在地图中Y轴坐标
     */
    private long locationY;

    /**
     * 数据包对应的业务应用版本Code
     */
    private int versionCode;

    /**
     * 需要启动的业务APP的applicationID
     */
    private String startAppId;
    /**
	 * 后台应用表ID
	 */
	private String layoutId;
    
    private String floorId;//楼层id
    /**
	 * 设备执行模板名称
	 */
	private String deviceModule;
	/**
	 * 设备执行模板
	 */
	private String deviceModuleId;

	private String code;

	private String address;

	private String nameOrCode;

	private Integer machineId;

    public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public long getLocationX() {
		return locationX;
	}

	public void setLocationX(long locationX) {
		this.locationX = locationX;
	}

	public long getLocationY() {
		return locationY;
	}

	public void setLocationY(long locationY) {
		this.locationY = locationY;
	}

	public int getVersionCode() {
		return versionCode;
	}

	public void setVersionCode(int versionCode) {
		this.versionCode = versionCode;
	}

	public String getStartAppId() {
		return startAppId;
	}

	public void setStartAppId(String startAppId) {
		this.startAppId = startAppId;
	}
	
	public String getLayoutId() {
		return layoutId;
	}

	public void setLayoutId(String layoutId) {
		this.layoutId = layoutId;
	}

	public String getFloorId() {
		return floorId;
	}

	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public String getDeviceModule() {
		return deviceModule;
	}

	public void setDeviceModule(String deviceModule) {
		this.deviceModule = deviceModule;
	}
	
	public String getTerminalName() {
		return terminalName;
	}

	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}

	public String getDeviceModuleId() {
		return deviceModuleId;
	}

	public void setDeviceModuleId(String deviceModuleId) {
		this.deviceModuleId = deviceModuleId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getNameOrCode() {
		return nameOrCode;
	}

	public void setNameOrCode(String nameOrCode) {
		this.nameOrCode = nameOrCode;
	}

	public Integer getMachineId() {
		return machineId;
	}

	public void setMachineId(Integer machineId) {
		this.machineId = machineId;
	}

	@Override
	public String toString() {
		return "MachineVO{" +
				"id='" + id + '\'' +
				", terminalName='" + terminalName + '\'' +
				", mallId='" + mallId + '\'' +
				", locationX=" + locationX +
				", locationY=" + locationY +
				", versionCode=" + versionCode +
				", startAppId='" + startAppId + '\'' +
				", layoutId='" + layoutId + '\'' +
				", floorId='" + floorId + '\'' +
				", deviceModule='" + deviceModule + '\'' +
				", deviceModuleId='" + deviceModuleId + '\'' +
				", code='" + code + '\'' +
				", address='" + address + '\'' +
				", nameOrCode='" + nameOrCode + '\'' +
				", machineId=" + machineId +
				'}';
	}
}
