package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

public class MallCategoryListVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;
	private List<MallCategoryVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<MallCategoryVO> getConfig() {
		return config;
	}
	public void setConfig(List<MallCategoryVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "MallCategoryListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
