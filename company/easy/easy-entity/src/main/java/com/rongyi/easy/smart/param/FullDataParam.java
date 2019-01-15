package com.rongyi.easy.smart.param;

import java.io.Serializable;

import com.rongyi.easy.bsoms.param.BaseParam;

public class FullDataParam extends BaseParam implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//商场id
	private String mallName;//商场名
	private String beginTime;//开始时间
	private String endTime;//结束时间
	private Integer status;//打包状态 1:完成,2:失败，其他为全部
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getMallName() {
		return mallName;
	}
	public void setMallName(String mallName) {
		this.mallName = mallName;
	}
	public String getBeginTime() {
		return beginTime;
	}
	public void setBeginTime(String beginTime) {
		this.beginTime = beginTime;
	}
	public String getEndTime() {
		return endTime;
	}
	public void setEndTime(String endTime) {
		this.endTime = endTime;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "FullDataParam [mallId=" + mallId + ", mallName=" + mallName
				+ ", beginTime=" + beginTime + ", endTime=" + endTime
				+ ", status=" + status + "]";
	}
	
}
