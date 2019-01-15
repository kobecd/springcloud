package com.rongyi.easy.terminal.member.param;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MemberLoginStatusParam implements Serializable {
	private String statusKey;

	public String getStatusKey() {
		return statusKey;
	}

	public void setStatusKey(String statusKey) {
		this.statusKey = statusKey;
	}

	@Override
	public String toString() {
		return "MemberLoginStatusParam [statusKey=" + statusKey + "]";
	}

	
	
}
