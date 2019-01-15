package com.rongyi.easy.smart.param;

import java.io.Serializable;

/**
 * 数据统计参数类
 * @author user
 *
 */
public class DataStatisticParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//商场id
	private String startTime;//开始时间
	private String endTime;//结束时间
	private Integer dateType;//日期类型 1:昨天,2:今天
	private String terminalCode;//设备编号
	private String terminalName;//设备名称
	private String position;//位置信息
	private Integer statisticType;//统计类型 1:总表,2:商品明细表,3:页面元素点击表
	private Integer currentPage;
	private Integer pageSize;
	private String commodityName;//商品名称
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getStartTime() {
		return startTime;
	}
	public void setStartTime(String startTime) {
		this.startTime = startTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getDateType() {
		return dateType;
	}
	public void setDateType(Integer dateType) {
		this.dateType = dateType;
	}
	public String getTerminalCode() {
		return terminalCode;
	}
	public void setTerminalCode(String terminalCode) {
		this.terminalCode = terminalCode;
	}
	public String getTerminalName() {
		return terminalName;
	}
	public void setTerminalName(String terminalName) {
		this.terminalName = terminalName;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public Integer getStatisticType() {
		return statisticType;
	}
	public void setStatisticType(Integer statisticType) {
		this.statisticType = statisticType;
	}
	public Integer getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}
	public Integer getPageSize() {
		return pageSize;
	}
	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}
	public String getCommodityName() {
		return commodityName;
	}
	public void setCommodityName(String commodityName) {
		this.commodityName = commodityName;
	}
	@Override
	public String toString() {
		return "DataStatisticParam [mallId=" + mallId + ", startTime="
				+ startTime + ", endTime=" + endTime + ", dateType=" + dateType
				+ ", terminalCode=" + terminalCode + ", terminalName="
				+ terminalName + ", position=" + position + ", statisticType="
				+ statisticType + ", currentPage=" + currentPage
				+ ", pageSize=" + pageSize + ", commodityName=" + commodityName
				+ "]";
	}
	
}
