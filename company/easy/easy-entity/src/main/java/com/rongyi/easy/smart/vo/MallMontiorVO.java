package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class MallMontiorVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId; //商场id
	private String mallName;//商场名
	private String updateAt;//时间
	private Integer status;//状态
	
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
	public String getUpdateAt() {
		return updateAt;
	}
	public void setUpdateAt(String updateAt) {
		this.updateAt = updateAt;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "MallMontiorVO [mallId=" + mallId + ", mallName=" + mallName
				+ ", updateAt=" + updateAt + ", status=" + status + "]";
	}
	
	
}
