package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

@SuppressWarnings("serial")
public class QRCodeScanParam implements Serializable{
	private String mallId;
	private String ticket;
	/**
	 * 登陆二维码：MD5(mac + 终端时间戳)
	 */
	private String resourceId;
	private String openid;
	//[1-屏端登录、2-充电服务]
	private String type;
	/**
	 * 扫码时间戳
	 */
	private long ts;
	
	public long getTs() {
		return ts;
	}
	public void setTs(long ts) {
		this.ts = ts;
	}
	
	public String getTicket() {
		return ticket;
	}
	public void setTicket(String ticket) {
		this.ticket = ticket;
	}
	
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getResourceId() {
		return resourceId;
	}
	public void setResourceId(String resourceId) {
		this.resourceId = resourceId;
	}
	
	@Override
	public String toString() {
		return "QRCodeScanParam [mallId=" + mallId + ", ticket=" + ticket + ", resourceId=" + resourceId + ", openid="
				+ openid + ", type=" + type + ", ts=" + ts + "]";
	}
	

	
}
