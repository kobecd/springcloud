package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

/**
 * 
 * @ClassName     MallMemberRuleConfigQueryParam.java 
 * @Description   TODO 商家会员规则配置PARAM
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月28日 下午3:09:16
 */
@SuppressWarnings("serial")
public class MallMemberRuleConfigQueryParam implements Serializable{

	private String mallId;

	private String mac;
	
	public String getMac() {
		return mac;
	}

	public void setMac(String mac) {
		this.mac = mac;
	}
	
	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	@Override
	public String toString() {
		return "MallMemberRuleConfigQueryParam [mallId=" + mallId + ", mac=" + mac + "]";
	}


	
	
	
}
