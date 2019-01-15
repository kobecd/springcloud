package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;
/**
 * 推荐店铺数据列表1.1
 * @author user
 *
 */
public class RecommendShopListVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;//机器id
	private List<RecommendShopVO> config;
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public List<RecommendShopVO> getConfig() {
		return config;
	}
	public void setConfig(List<RecommendShopVO> config) {
		this.config = config;
	}
	@Override
	public String toString() {
		return "RecommendShopListVO [terminalId=" + terminalId + ", config="
				+ config + "]";
	}
	
}
