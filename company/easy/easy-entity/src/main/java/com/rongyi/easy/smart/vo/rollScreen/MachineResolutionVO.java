package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;

/**
 * 电子易拉宝设备分辨率数据VO
 * @author user
 *
 */
public class MachineResolutionVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 设备编号
	 */
	private String terminalId;
	/**
	 * 分辨率
	 */
	private String resolution;
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	@Override
	public String toString() {
		return "MachineResolutionVO [terminalId=" + terminalId
				+ ", resolution=" + resolution + "]";
	}
	
}
