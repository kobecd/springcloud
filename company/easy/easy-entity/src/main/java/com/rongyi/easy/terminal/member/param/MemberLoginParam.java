package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberLoginParam.java 
 * @Description   TODO 会员登陆PARAM
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @version       V1.0   
 * @Date          2017年8月24日 上午10:58:01
 */
@SuppressWarnings("serial")
public class MemberLoginParam implements Serializable{
	
	private String phone;
	private String mallId;
	private Integer platform;	
	private Integer type;
	private String code;
	/**
	 * 登陆方式  0：手机号 1：会员卡号 2微信
	 */
	private Integer loginType;
	private String solidCard;
	
	public Integer getLoginType() {
		return loginType;
	}
	public void setLoginType(Integer loginType) {
		this.loginType = loginType;
	}
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getSolidCard() {
		return solidCard;
	}
	public void setSolidCard(String solidCard) {
		this.solidCard = solidCard;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
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
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	@Override
	public String toString() {
		return "MemberLoginParam [phone=" + phone + ", mallId=" + mallId + ", platform=" + platform + ", type=" + type
				+ ", code=" + code + ", loginType=" + loginType + ", solidCard=" + solidCard + "]";
	}
	
	
	
	

}
