package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberQRCodeVO.java 
 * @Description   TODO 会员二维码VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月26日 下午10:36:29
 */
@SuppressWarnings("serial")
public class MemberQRCodeVO implements Serializable {
	private Integer expireSeconds;
	private String qrcode;
	private String statusKey;
	
	public String getStatusKey() {
		return statusKey;
	}
	public void setStatusKey(String statusKey) {
		this.statusKey = statusKey;
	}
	public String getQrcode() {
		return qrcode;
	}
	public void setQrcode(String qrcode) {
		this.qrcode = qrcode;
	}
	public Integer getExpireSeconds() {
		return expireSeconds;
	}
	public void setExpireSeconds(Integer expireSeconds) {
		this.expireSeconds = expireSeconds;
	}
	@Override
	public String toString() {
		return "MemberQRCodeVO [expireSeconds=" + expireSeconds + ", qrcode=" + qrcode + ", statusKey=" + statusKey
				+ "]";
	}
	
	
	
}
