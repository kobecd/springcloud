package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * 数据统计总表返回VO
 * @author user
 *
 */
public class TotalDataVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String pro_name;
	private String type;
	private String mall_id;//商场id
	private String hash_key;
//	private int jgrsSum;//屏前经过人数
	private String time;//时间
	private String deviceNumber;//设备编号
	private String deviceName;//设备名称
	private String position;//位置信息
//	private int llrsSum;//屏前浏览人数
//	private double rjsjSum;//屏前人均使用时长
	private int materialClickConvergeSum;//素材点击次数(屏维度聚合值)
	
	//后台统计
	private int sweepCount;//扫码数
	private int orderCount;//下单数
	private int tradeSuccessCount;//交易成功数
	private int tradeNumbers;//交易人数
	private double tradeAmount;//交易金额
	
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
	public int getMaterialClickConvergeSum() {
		return materialClickConvergeSum;
	}
	public void setMaterialClickConvergeSum(int materialClickConvergeSum) {
		this.materialClickConvergeSum = materialClickConvergeSum;
	}
	public int getSweepCount() {
		return sweepCount;
	}
	public void setSweepCount(int sweepCount) {
		this.sweepCount = sweepCount;
	}
	public int getOrderCount() {
		return orderCount;
	}
	public void setOrderCount(int orderCount) {
		this.orderCount = orderCount;
	}
	public int getTradeSuccessCount() {
		return tradeSuccessCount;
	}
	public void setTradeSuccessCount(int tradeSuccessCount) {
		this.tradeSuccessCount = tradeSuccessCount;
	}
	public int getTradeNumbers() {
		return tradeNumbers;
	}
	public void setTradeNumbers(int tradeNumbers) {
		this.tradeNumbers = tradeNumbers;
	}
	public double getTradeAmount() {
		return tradeAmount;
	}
	public void setTradeAmount(double tradeAmount) {
		this.tradeAmount = tradeAmount;
	}
	@Override
	public String toString() {
		return "TotalDataVO [pro_name=" + pro_name + ", type=" + type
				+ ", mall_id=" + mall_id + ", hash_key=" + hash_key + ", time="
				+ time + ", deviceNumber=" + deviceNumber + ", deviceName="
				+ deviceName + ", position=" + position
				+ ", materialClickConvergeSum=" + materialClickConvergeSum
				+ ", sweepCount=" + sweepCount + ", orderCount=" + orderCount
				+ ", tradeSuccessCount=" + tradeSuccessCount
				+ ", tradeNumbers=" + tradeNumbers + ", tradeAmount="
				+ tradeAmount + "]";
	}
	
}
