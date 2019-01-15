package com.rongyi.easy.smart.vo.eShelf;

import java.io.Serializable;
import java.util.List;

/**
 * 电子货架广告数据列表2.2
 * @author user
 *
 */
public class AppAdvertListVO implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;//设备编号
	private List<TemplateAdvertVO> config;//广告数据
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<TemplateAdvertVO> getConfig() {
		return config;
	}
	public void setConfig(List<TemplateAdvertVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "AppAdvertListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
