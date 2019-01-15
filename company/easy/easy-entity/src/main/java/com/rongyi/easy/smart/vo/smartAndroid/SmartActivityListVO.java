package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class SmartActivityListVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;//机器id
	private List<SmartActivityVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<SmartActivityVO> getConfig() {
		return config;
	}
	public void setConfig(List<SmartActivityVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "SmartActivityListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
		
}
