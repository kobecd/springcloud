package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberPointQueryParam.java 
 * @Description   TODO 会员积分查询param
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @version       V1.0   
 * @Date          2017年8月24日 下午4:34:29
 */
@SuppressWarnings("serial")
public class MemberPointQueryParam implements Serializable{

	private String mallId;
	private Integer platform;
	private Long uid;
	
	public String getMallId() {
		return mallId;
	}
	public void setMallId(String mallId) {
		this.mallId = mallId;
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
	@Override
	public String toString() {
		return "MemberPointQueryParam [mallId=" + mallId + ", platform=" + platform + ", uid=" + uid + "]";
	}
	
	
	
}
