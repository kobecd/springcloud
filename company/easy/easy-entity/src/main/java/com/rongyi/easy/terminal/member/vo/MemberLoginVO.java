package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

/**
 * 
 * @ClassName     MemberLoginVO.java 
 * @Description   TODO 会员登陆结果VO
 * @copyright	      上海容易网电子商务股份有限公司. 		
 * @author        huweijie 
 * @version       V1.0   
 * @Date          2017年8月24日 下午5:32:06
 */
@SuppressWarnings("serial")
public class MemberLoginVO implements Serializable{

	private MemberDetailQueryVO  memberDetail;
	
	private String sessionKey;
	
	public String getSessionKey() {
		return sessionKey;
	}

	public void setSessionKey(String sessionKey) {
		this.sessionKey = sessionKey;
	}

	public MemberDetailQueryVO getMemberDetail() {
		return memberDetail;
	}

	public void setMemberDetail(MemberDetailQueryVO memberDetail) {
		this.memberDetail = memberDetail;
	}

	@Override
	public String toString() {
		return "MemberLoginVO [memberDetail=" + memberDetail + ", sessionKey=" + sessionKey + "]";
	}

	
	
	
}
