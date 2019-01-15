package com.rongyi.easy.terminal.member.param;

public class MallMemberPointConfigQueryParam {

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
		return "MallMemberPointConfigQueryParam [mallId=" + mallId + ", mac=" + mac + "]";
	}




	
}
