package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class IncrementParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String mallId;//

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	@Override
	public String toString() {
		return "IncrementParam [mallId=" + mallId + "]";
	}
	
}
