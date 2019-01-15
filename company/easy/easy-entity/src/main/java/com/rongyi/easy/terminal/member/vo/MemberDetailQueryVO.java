package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberDetailQueryVO.java 
 * @Description   TODO 会员详情信息VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月24日 下午5:31:39
 */
@SuppressWarnings("serial")
public class MemberDetailQueryVO implements Serializable{
	private Long uid;
	private String solidCard;
	private String mallId;
	private String email;
	private String phone;
	private String photo;
	private String openid;
	private String realName;
	private String nickName;
	private String gender;
	private String idCard;
	private Integer point;
	private Integer hisPoint;
	private String level;
	private String levelName;
//	private List<MemberAddress> address;
//	private List<String> carNo;
	
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getSolidCard() {
		return solidCard;
	}
	public void setSolidCard(String solidCard) {
		this.solidCard = solidCard;
	}
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getPhoto() {
		return photo;
	}
	public void setPhoto(String photo) {
		this.photo = photo;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getRealName() {
		return realName;
	}
	public void setRealName(String realName) {
		this.realName = realName;
	}
	public String getNickName() {
		return nickName;
	}
	public void setNickName(String nickName) {
		this.nickName = nickName;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getIdCard() {
		return idCard;
	}
	public void setIdCard(String idCard) {
		this.idCard = idCard;
	}
	public Integer getPoint() {
		return point;
	}
	public void setPoint(Integer point) {
		this.point = point;
	}
	public Integer getHisPoint() {
		return hisPoint;
	}
	public void setHisPoint(Integer hisPoint) {
		this.hisPoint = hisPoint;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	public String getLevelName() {
		return levelName;
	}
	public void setLevelName(String levelName) {
		this.levelName = levelName;
	}
	@Override
	public String toString() {
		return "MemberDetailQueryVO [uid=" + uid + ", solidCard=" + solidCard + ", mallId=" + mallId + ", email="
				+ email + ", phone=" + phone + ", photo=" + photo + ", openid=" + openid + ", realName=" + realName
				+ ", nickName=" + nickName + ", gender=" + gender + ", idCard=" + idCard + ", point=" + point
				+ ", hisPoint=" + hisPoint + ", level=" + level + ", levelName=" + levelName + "]";
	}
	
	
	
	
	
}
