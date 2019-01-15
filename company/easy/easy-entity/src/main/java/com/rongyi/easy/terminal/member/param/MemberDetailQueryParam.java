package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;
/**
 * 
 * @ClassName     MemberDetailQueryParam.java 
 * @Description   TODO 会员详情信息查询param
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月24日 下午5:30:40
 */
@SuppressWarnings("serial")
public class MemberDetailQueryParam implements Serializable{
	
	private String mall_id;
	private Integer platform;
	private Long uid;
	private String phone;
	private String openid;
	private String solid_card;
	
	
	
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
	public Long getUid() {
		return uid;
	}
	public void setUid(Long uid) {
		this.uid = uid;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getOpenid() {
		return openid;
	}
	public void setOpenid(String openid) {
		this.openid = openid;
	}
	public String getSolid_card() {
		return solid_card;
	}
	public void setSolid_card(String solid_card) {
		this.solid_card = solid_card;
	}
	
	@Override
	public String toString() {
		return "MemberQueryParam [mall_id=" + mall_id + ", platform=" + platform + ", uid=" + uid + ", phone="
				+ phone + ", openid=" + openid + ", solid_card=" + solid_card + "]";
	}
	
	
	
}
