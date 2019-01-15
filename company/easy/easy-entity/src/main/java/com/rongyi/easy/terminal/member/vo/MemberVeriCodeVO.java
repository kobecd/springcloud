package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberVeriCodeVO.java 
 * @Description   TODO 会员短信验证码VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @version       V1.0   
 * @Date          2017年8月23日 下午5:25:56
 */
@SuppressWarnings("serial")
public class MemberVeriCodeVO implements Serializable{
	
	private String veriCode;

	public String getVeriCode() {
		return veriCode;
	}

	public void setVeriCode(String veriCode) {
		this.veriCode = veriCode;
	}

	@Override
	public String toString() {
		return "MemberVeriCodeVO [veriCode=" + veriCode + "]";
	}
	
	
}
