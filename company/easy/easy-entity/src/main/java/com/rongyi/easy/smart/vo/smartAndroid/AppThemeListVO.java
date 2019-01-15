package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class AppThemeListVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;
	private List<AppThemeVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<AppThemeVO> getConfig() {
		return config;
	}
	public void setConfig(List<AppThemeVO> config) {
		this.config = config;
	}
	
	@Override
	public String toString() {
		return "AppThemeListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
