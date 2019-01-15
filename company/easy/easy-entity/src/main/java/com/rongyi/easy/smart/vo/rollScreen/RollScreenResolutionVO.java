package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;
import java.util.List;

/**
 * 电子易拉宝设备排期模板分辨率2.2
 * @author user
 *
 */
public class RollScreenResolutionVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 设备ID
	 */
	private String terminalId;
	/**
	 * 模板分辨率列表
	 */
	private List<TemplateResolutionVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<TemplateResolutionVO> getConfig() {
		return config;
	}
	public void setConfig(List<TemplateResolutionVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "RollScreenResolutionVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
