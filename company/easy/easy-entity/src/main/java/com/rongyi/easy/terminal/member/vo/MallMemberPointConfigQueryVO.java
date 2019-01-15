package com.rongyi.easy.terminal.member.vo;

import java.io.Serializable;

@SuppressWarnings("serial")
public class MallMemberPointConfigQueryVO implements Serializable {

	private Integer caseId;

	private String bgImg;

	private Byte isRecom;

	private String giftIds;

	public Integer getCaseId() {
		return caseId;
	}

	public void setCaseId(Integer caseId) {
		this.caseId = caseId;
	}

	public String getBgImg() {
		return bgImg;
	}

	public void setBgImg(String bgImg) {
		this.bgImg = bgImg;
	}

	public Byte getIsRecom() {
		return isRecom;
	}

	public void setIsRecom(Byte isRecom) {
		this.isRecom = isRecom;
	}

	public String getGiftIds() {
		return giftIds;
	}

	public void setGiftIds(String giftIds) {
		this.giftIds = giftIds;
	}

	@Override
	public String toString() {
		return "MallMemberPointConfigQueryVO [caseId=" + caseId + ", bgImg=" + bgImg + ", isRecom=" + isRecom
				+ ", giftIds=" + giftIds + "]";
	}

	
	
}
