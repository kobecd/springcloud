package com.rongyi.easy.usercenter.member.param;

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
	private String mall_id;
	private Integer platform;	
	private Integer type;
	
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public String getMall_id() {
		return mall_id;
	}
	public void setMall_id(String mall_id) {
		this.mall_id = mall_id;
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
		return "MemberVeriCodeParam [phone=" + phone + ", mall_id=" + mall_id + ", platform=" + platform + ", type="
				+ type + "]";
	}
	
	
}
