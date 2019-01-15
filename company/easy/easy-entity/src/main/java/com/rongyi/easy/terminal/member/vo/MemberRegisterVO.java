package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MemberRegisterVO implements Serializable{
	
	private String uid;

	public String getUid() {
		return uid;
	}

	public void setUid(String uid) {
		this.uid = uid;
	}

	@Override
	public String toString() {
		return "MemberRegisterVO [uid=" + uid + "]";
	}

}
