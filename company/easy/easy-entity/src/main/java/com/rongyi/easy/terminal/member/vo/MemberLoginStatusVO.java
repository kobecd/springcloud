package com.rongyi.easy.terminal.member.vo;

public class MemberLoginStatusVO {

	private String mallId;
	private String ticket;
	private String openid;
	private String uid;
	private String phone;
	private String solidCard;
	private String point;
	private String level;
	private String levelName;
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
	public String getUid() {
		return uid;
	}
	public void setUid(String uid) {
		this.uid = uid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPoint() {
		return point;
	}
	public void setPoint(String point) {
		this.point = point;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
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
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	@Override
	public String toString() {
		return "MemberLoginStatusVO [mallId=" + mallId + ", ticket=" + ticket + ", openid=" + openid + ", uid=" + uid
				+ ", phone=" + phone + ", solidCard=" + solidCard + ", point=" + point + ", level=" + level
				+ ", levelName=" + levelName + ", ts=" + ts + "]";
	}
	
	
	
}
