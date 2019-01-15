package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class ActivityCategoryListVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;//机器id
	private List<ActivityCategoryVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<ActivityCategoryVO> getConfig() {
		return config;
	}
	public void setConfig(List<ActivityCategoryVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "ActivityCategoryListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
