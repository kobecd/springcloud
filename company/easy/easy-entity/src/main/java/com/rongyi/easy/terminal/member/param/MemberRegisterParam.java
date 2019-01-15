package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;
/**
 * 
 * @ClassName     MemberRegisterParam.java 
 * @Description   TODO 会员注册PARAM
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @version       V1.0   
 * @Date          2017年8月24日 下午1:33:42
 */
@SuppressWarnings("serial")
public class MemberRegisterParam implements Serializable{

	private String phone;
	private String mallId;
	private Integer platform;	
	private Integer type;
	private String code;
	private String solidCard;
	
	/**
	 * 注册方式  1：手机号 3：第三方
	 */
	private Integer regType;
	
	
	public Integer getRegType() {
		return regType;
	}
	public void setRegType(Integer regType) {
		this.regType = regType;
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
	
	@Override
	public String toString() {
		return "MemberRegisterParam [phone=" + phone + ", mallId=" + mallId + ", platform=" + platform + ", type="
				+ type + ", code=" + code + ", solidCard=" + solidCard + ", regType=" + regType + "]";
	}
	
}
