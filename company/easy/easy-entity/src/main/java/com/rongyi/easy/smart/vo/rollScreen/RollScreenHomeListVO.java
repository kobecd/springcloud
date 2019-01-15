package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;
import java.util.List;

public class RollScreenHomeListVO implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;
	private List<TemplateHomeVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<TemplateHomeVO> getConfig() {
		return config;
	}
	public void setConfig(List<TemplateHomeVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "RollScreenHomeListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
