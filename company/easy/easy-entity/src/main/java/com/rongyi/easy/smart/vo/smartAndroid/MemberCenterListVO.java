package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class MemberCenterListVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;//机器id
	private List<MemberCenterModuleVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<MemberCenterModuleVO> getConfig() {
		return config;
	}
	public void setConfig(List<MemberCenterModuleVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "MemberCenterListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
