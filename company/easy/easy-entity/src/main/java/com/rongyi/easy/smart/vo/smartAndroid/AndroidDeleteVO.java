package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class AndroidDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private List<String> shops;
	private List<String> floors;
	private List<String> coupons;
	private List<String> publicFacilities;
	private List<String> categories;
	private List<String> activities;
	private List<String> resources;
	
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
	public List<String> getCategories() {
		return categories;
	}
	public void setCategories(List<String> categories) {
		this.categories = categories;
	}
	public List<String> getActivities() {
		return activities;
	}
	public void setActivities(List<String> activities) {
		this.activities = activities;
	}
	public List<String> getResources() {
		return resources;
	}
	public void setResources(List<String> resources) {
		this.resources = resources;
	}
	@Override
	public String toString() {
		return "DeleteVO [shops=" + shops + ", floors=" + floors + ", coupons="
				+ coupons + ", publicFacilities=" + publicFacilities
				+ ", categories=" + categories + ", activities=" + activities
				+ ", resources=" + resources + "]";
	}
	
}
