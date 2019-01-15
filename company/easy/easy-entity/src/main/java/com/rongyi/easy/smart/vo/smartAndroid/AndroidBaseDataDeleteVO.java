package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class AndroidBaseDataDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> shops;
	private List<String> floors;
	private List<String> coupons;
	private List<String> publicFacilities;
	
	public List<String> getShops() {
		return shops;
	}
	public void setShops(List<String> shops) {
		this.shops = shops;
	}
	public List<String> getFloors() {
		return floors;
	}
	public void setFloors(List<String> floors) {
		this.floors = floors;
	}
	public List<String> getCoupons() {
		return coupons;
	}
	public void setCoupons(List<String> coupons) {
		this.coupons = coupons;
	}
	public List<String> getPublicFacilities() {
		return publicFacilities;
	}
	public void setPublicFacilities(List<String> publicFacilities) {
		this.publicFacilities = publicFacilities;
	}
	@Override
	public String toString() {
		return "AndroidDataDeleteVO [shops=" + shops + ", floors=" + floors
				+ ", coupons=" + coupons + ", publicFacilities="
				+ publicFacilities + "]";
	}
	
}
