package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

/**
 * 
 * @ClassName     MallConfigQueryParam.java 
 * @Description   TODO 商场参数配置查询PARAM
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月28日 下午1:44:06
 */
@SuppressWarnings("serial")
public class MallConfigQueryParam implements Serializable{
	
	private String mallId;
	private String moduleType;
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getModuleType() {
		return moduleType;
	}
	public void setModuleType(String moduleType) {
		this.moduleType = moduleType;
	}
	@Override
	public String toString() {
		return "MallConfigQueryParam [mallId=" + mallId + ", moduleType=" + moduleType + "]";
	}
	
	

}
