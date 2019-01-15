package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MallMemberRegisterConfigQueryVO implements Serializable{

	private String mallId;

	private Integer caseId;

	private Integer style;
	
	private String defautlImgPath;

	public String getMallId() {
		return mallId;
	}

	public void setMallId(String mallId) {
		this.mallId = mallId;
	}

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public Integer getStyle() {
		return style;
	}

	public void setStyle(Integer style) {
		this.style = style;
	}

	public String getDefautlImgPath() {
		return defautlImgPath;
	}

	public void setDefautlImgPath(String defautlImgPath) {
		this.defautlImgPath = defautlImgPath;
	}

	@Override
	public String toString() {
		return "MallMemberRegisterConfigQueryVO [mallId=" + mallId + ", caseId=" + caseId + ", style=" + style
				+ ", defautlImgPath=" + defautlImgPath + "]";
	}

	
}
