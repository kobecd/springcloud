package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberVeriCodeParam.java 
 * @Description   TODO 会员短信验证码param
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @version       V1.0   
 * @Date          2017年8月23日 下午5:24:05
 */
@SuppressWarnings("serial")
public class MemberVeriCodeParam implements Serializable{
	private String phone;
	private String mallId;
	private Integer platform;	
	private Integer type;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public Integer getPlatform() {
		return platform;
	}
	public void setPlatform(Integer platform) {
		this.platform = platform;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "MemberVeriCodeParam [phone=" + phone + ", mallId=" + mallId + ", platform=" + platform + ", type="
				+ type + "]";
	}
	
	
}
