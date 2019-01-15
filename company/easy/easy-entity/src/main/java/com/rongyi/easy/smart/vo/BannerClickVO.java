package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * 页面元素点击表返回VO
 * @author user
 *
 */
public class BannerClickVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pro_name;
	private String type;
	private String mall_id;//商场id
	private String hash_key;
	private int positionClickSum;//位置点击次数
	private String time;//时间
	private String deviceNumber;//设备编号
	private String deviceName;//设备名称
	private String position;//位置信息
	private String pagePosition;//页面位置
	
	public String getPro_name() {
		return pro_name;
	}
	public void setPro_name(String pro_name) {
		this.pro_name = pro_name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getMall_id() {
		return mall_id;
	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
	}
	public String getHash_key() {
		return hash_key;
	}
	public void setHash_key(String hash_key) {
		this.hash_key = hash_key;
	}
	public int getPositionClickSum() {
		return positionClickSum;
	}
	public void setPositionClickSum(int positionClickSum) {
		this.positionClickSum = positionClickSum;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getDeviceNumber() {
		return deviceNumber;
	}
	public void setDeviceNumber(String deviceNumber) {
		this.deviceNumber = deviceNumber;
	}
	public String getDeviceName() {
		return deviceName;
	}
	public void setDeviceName(String deviceName) {
		this.deviceName = deviceName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPagePosition() {
		return pagePosition;
	}
	public void setPagePosition(String pagePosition) {
		this.pagePosition = pagePosition;
	}
	@Override
	public String toString() {
		return "BannerClickVO [pro_name=" + pro_name + ", type=" + type
				+ ", mall_id=" + mall_id + ", hash_key=" + hash_key
				+ ", positionClickSum=" + positionClickSum + ", time=" + time
				+ ", deviceNumber=" + deviceNumber + ", deviceName="
				+ deviceName + ", position=" + position + ", pagePosition="
				+ pagePosition + "]";
	}
	
}
