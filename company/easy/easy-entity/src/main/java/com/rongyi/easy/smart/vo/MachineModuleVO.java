package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * Created by yandong on 2017/11/22.
 */
public class MachineModuleVO implements Serializable{

    private static final long serialVersionUID = 388235432147468474L;
    private Integer id;

    private String name;
    private String mallName;

    private String code;

    private Integer layoutId;

    private Integer caseId;

    private String layoutNumber;

    private String layoutName;

    private String mac;

    private String mallId;

    private String address;

    private String caseName;

    private String pro;//省
    private String city;//市
    private String area;//区
    private String bussiness;//商圈

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getPro() {
        return pro;
    }

    public void setPro(String pro) {
        this.pro = pro;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getBussiness() {
        return bussiness;
    }

    public void setBussiness(String bussiness) {
        this.bussiness = bussiness;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
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

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getLayoutNumber() {
        return layoutNumber;
    }

    public void setLayoutNumber(String layoutNumber) {
        this.layoutNumber = layoutNumber;
    }

    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public String getCaseName() {
        return caseName;
    }

    public void setCaseName(String caseName) {
        this.caseName = caseName;
    }

    @Override
    public String toString() {
        return "MachineModuleVO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", mallName='" + mallName + '\'' +
                ", code='" + code + '\'' +
                ", layoutId=" + layoutId +
                ", caseId=" + caseId +
                ", layoutNumber='" + layoutNumber + '\'' +
                ", layoutName='" + layoutName + '\'' +
                ", mac='" + mac + '\'' +
                ", mallId='" + mallId + '\'' +
                ", address='" + address + '\'' +
                ", caseName='" + caseName + '\'' +
                ", pro='" + pro + '\'' +
                ", city='" + city + '\'' +
                ", area='" + area + '\'' +
                ", bussiness='" + bussiness + '\'' +
                '}';
    }
}
