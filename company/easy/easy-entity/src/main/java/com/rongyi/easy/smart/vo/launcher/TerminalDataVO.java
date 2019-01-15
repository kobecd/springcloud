package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;
import java.util.List;

/**
 * 设备排期信息VO
 * @author user
 *
 */
public class TerminalDataVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 设备ID
	 */
	private String terminalId;
	/**
	 * 设备排期模板数据列表
	 */
	private List<?> config;

	public String getTerminalId() {
		return terminalId;
	}

	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}

	public List<?> getConfig() {
		return config;
	}

	public void setConfig(List<?> config) {
		this.config = config;
	}

	@Override
	public String toString() {
		return "TerminalDataVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
