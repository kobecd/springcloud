package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MemberAddress implements Serializable{
	private String province;
	private Integer provinceId;
	private String city;
	private Integer cityId;
	private String area;
	private Integer areaId;
	private String address;
	private String receiver;
	private String phone;
	private Integer isDefault;
	public String getProvince() {
		return province;
	}
	public void setProvince(String province) {
		this.province = province;
	}
	public Integer getProvinceId() {
		return provinceId;
	}
	public void setProvinceId(Integer provinceId) {
		this.provinceId = provinceId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public Integer getCityId() {
		return cityId;
	}
	public void setCityId(Integer cityId) {
		this.cityId = cityId;
	}
	public String getArea() {
		return area;
	}
	public void setArea(String area) {
		this.area = area;
	}
	public Integer getAreaId() {
		return areaId;
	}
	public void setAreaId(Integer areaId) {
		this.areaId = areaId;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getReceiver() {
		return receiver;
	}
	public void setReceiver(String receiver) {
		this.receiver = receiver;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Integer getIsDefault() {
		return isDefault;
	}
	public void setIsDefault(Integer isDefault) {
		this.isDefault = isDefault;
	}
	@Override
	public String toString() {
		return "MemberAddress [province=" + province + ", provinceId=" + provinceId + ", city=" + city + ", cityId="
				+ cityId + ", area=" + area + ", areaId=" + areaId + ", address=" + address + ", receiver=" + receiver
				+ ", phone=" + phone + ", isDefault=" + isDefault + "]";
	}
	
	
	
	
}
