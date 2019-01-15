package com.rongyi.easy.smart.entity;

import java.io.Serializable;

public class MachineExpandEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private Integer owner;

    private Short customerType;

    private String mallId;

    private String floorId;

    private Integer coordinateX;

    private Integer coordinateY;

    private String customerName;

    private String customerPhone;

    private String maintainName;

    private String maintainPhone;

    private String bdName;

    private String bdPhone;

    private String remarks;

    private Integer machineId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getOwner() {
        return owner;
    }

    public void setOwner(Integer owner) {
        this.owner = owner;
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

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
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

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getMaintainName() {
        return maintainName;
    }

    public void setMaintainName(String maintainName) {
        this.maintainName = maintainName;
    }

    public String getMaintainPhone() {
        return maintainPhone;
    }

    public void setMaintainPhone(String maintainPhone) {
        this.maintainPhone = maintainPhone;
    }

    public String getBdName() {
        return bdName;
    }

    public void setBdName(String bdName) {
        this.bdName = bdName;
    }

    public String getBdPhone() {
        return bdPhone;
    }

    public void setBdPhone(String bdPhone) {
        this.bdPhone = bdPhone;
    }

    public String getRemarks() {
        return remarks;
    }

    public void setRemarks(String remarks) {
        this.remarks = remarks;
    }

    public Integer getMachineId() {
        return machineId;
    }

    public void setMachineId(Integer machineId) {
        this.machineId = machineId;
    }
}