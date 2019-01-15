package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class MachinePTListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 数据包文件名
	 */
	private String resourceName;
	/**
	 * 商场id
	 */
	private String mallId;
	/**
	 * 商场名称
	 */
	private String mallName;
	/**
	 * 城市名
	 */
	private String cityName;
	/**
	 * 设备点位配置列表
	 */
	private List<MachinePTVO> terminals;
	
	public String getResourceName() {
		return resourceName;
	}
	public void setResourceName(String resourceName) {
		this.resourceName = resourceName;
	}
	public List<MachinePTVO> getTerminals() {
		return terminals;
	}
	public void setTerminals(List<MachinePTVO> terminals) {
		this.terminals = terminals;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	@Override
	public String toString() {
		return "MachinePTListVO [resourceName=" + resourceName + ", mallId="
				+ mallId + ", mallName=" + mallName + ", cityName=" + cityName
				+ ", terminals=" + terminals + "]";
	}
	
}
