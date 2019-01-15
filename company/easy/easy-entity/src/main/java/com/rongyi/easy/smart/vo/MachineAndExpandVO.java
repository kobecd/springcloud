package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * 设备基础信息以及拓展信息
 * @author user
 *
 */
public class MachineAndExpandVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//设备ID
    private String code;//设备编号
    private String name;//设备名称
    private String address;//位置信息
    private Integer state;//设备状态
    private Integer caseId;//商家后台模板id
    private String appId;//默认启动业务APP应用
    
    //ADD 2018/01/25
    private Integer machineOwnerId;//设备主ID
    private Integer bannerPlay;//广告播放  1是，0否
    private String floorId;//楼层ID
    private Integer groupId;//分组ID
    private Integer ownerType;//资产类型    0 其他， 1容易网资产， 2售卖资产， 3合作资产， 4客户自属资产
    private Short customerType;//商户类型:0 商场， 1 店铺
    private String mallId;//商场ID
    private Integer coordinateX;
    private Integer coordinateY;
    
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
	public Integer getState() {
		return state;
	}
	public void setState(Integer state) {
		this.state = state;
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
	public Integer getMachineOwnerId() {
		return machineOwnerId;
	}
	public void setMachineOwnerId(Integer machineOwnerId) {
		this.machineOwnerId = machineOwnerId;
	}
	public Integer getBannerPlay() {
		return bannerPlay;
	}
	public void setBannerPlay(Integer bannerPlay) {
		this.bannerPlay = bannerPlay;
	}
	public String getFloorId() {
		return floorId;
	}
	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}
	public Integer getGroupId() {
		return groupId;
	}
	public void setGroupId(Integer groupId) {
		this.groupId = groupId;
	}
	public Integer getOwnerType() {
		return ownerType;
	}
	public void setOwnerType(Integer ownerType) {
		this.ownerType = ownerType;
	}
	public Short getCustomerType() {
		return customerType;
	}
	public void setCustomerType(Short customerType) {
		this.customerType = customerType;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public Integer getCoordinateX() {
		return coordinateX;
	}
	public void setCoordinateX(Integer coordinateX) {
		this.coordinateX = coordinateX;
	}
	public Integer getCoordinateY() {
		return coordinateY;
	}
	public void setCoordinateY(Integer coordinateY) {
		this.coordinateY = coordinateY;
	}
	@Override
	public String toString() {
		return "MachineAndExpandVO [id=" + id + ", code=" + code + ", name="
				+ name + ", address=" + address + ", state=" + state
				+ ", caseId=" + caseId + ", appId=" + appId
				+ ", machineOwnerId=" + machineOwnerId + ", bannerPlay="
				+ bannerPlay + ", floorId=" + floorId + ", groupId=" + groupId
				+ ", ownerType=" + ownerType + ", customerType=" + customerType
				+ ", mallId=" + mallId + ", coordinateX=" + coordinateX
				+ ", coordinateY=" + coordinateY + "]";
	}
    
}
