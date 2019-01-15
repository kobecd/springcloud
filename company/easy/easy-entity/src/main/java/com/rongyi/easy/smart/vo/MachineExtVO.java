package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class MachineExtVO implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String code;

    private String name;

    private String address;

    private String state;

    private Integer status;

    private Integer updateStatus; //

    private Integer caseUpdateStatus ;//模板内容是否有变更

    private Integer appUpdateStatus; //app是否有更新

    private String remarks;
    
    private Integer caseId;//商家后台模板id

    private String caseName;

    private String layoutName; //模板类型

    private String layoutHomeModule; //模板首页模块
    
    private String appId;//默认启动业务APP应用

    private String appName;//默认启动业务APP应用

    private Long lastHeartTime;

    private String lastHeartTimeStr;

    private String mac;
    
    private Integer createAt;
    
    private Integer updateAt;

    private String floorId;

    private String floorName;

    private Integer dataVersion;

    private String screenPixels;//屏幕分辨率
    /**
     * 系统类型  1 安卓， 2 windows
     */
    private Integer osType;

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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
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

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Long getLastHeartTime() {
        return lastHeartTime;
    }

    public void setLastHeartTime(Long lastHeartTime) {
        this.lastHeartTime = lastHeartTime;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

	public Integer getCreateAt() {
		return createAt;
	}

	public void setCreateAt(Integer createAt) {
		this.createAt = createAt;
	}

	public Integer getUpdateAt() {
		return updateAt;
	}

	public void setUpdateAt(Integer updateAt) {
		this.updateAt = updateAt;
	}

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layouName) {
        this.layoutName = layouName;
    }

    public String getLayoutHomeModule() {
        return layoutHomeModule;
    }

    public void setLayoutHomeModule(String layoutHomeModule) {
        this.layoutHomeModule = layoutHomeModule;
    }

    public String getLastHeartTimeStr() {
        return lastHeartTimeStr;
    }

    public void setLastHeartTimeStr(String lastHeartTimeStr) {
        this.lastHeartTimeStr = lastHeartTimeStr;
    }

    public Integer getDataVersion() {
        return dataVersion;
    }

    public void setDataVersion(Integer dataVersion) {
        this.dataVersion = dataVersion;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getUpdateStatus() {
        return updateStatus;
    }

    public void setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
    }

    public String getAppName() {
        return appName;
    }

    public void setAppName(String appName) {
        this.appName = appName;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    public Integer getCaseUpdateStatus() {
        return caseUpdateStatus;
    }

    public void setCaseUpdateStatus(Integer caseUpdateStatus) {
        this.caseUpdateStatus = caseUpdateStatus;
    }

    public Integer getAppUpdateStatus() {
        return appUpdateStatus;
    }

    public void setAppUpdateStatus(Integer appUpdateStatus) {
        this.appUpdateStatus = appUpdateStatus;
    }

    public String getScreenPixels() { return screenPixels; }

    public void setScreenPixels(String screenPixels) { this.screenPixels = screenPixels; }
}
