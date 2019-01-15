package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class HomeModuleListVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;//机器id
	private List<HomeModuleVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<HomeModuleVO> getConfig() {
		return config;
	}
	public void setConfig(List<HomeModuleVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "HomeListVO [terminalId=" + terminalId + ", config=" + config
				+ "]";
	}
	
}
