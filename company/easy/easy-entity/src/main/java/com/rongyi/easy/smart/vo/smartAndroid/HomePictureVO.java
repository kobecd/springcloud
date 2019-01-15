package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;

public class HomePictureVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String terminalId;
	private String picture;
	private String localPicture;
	private String type;//1 标准首页，2 商场导购
	
	public String getTerminalId() {
		return terminalId;
	}
	public void setTerminalId(String terminalId) {
		this.terminalId = terminalId;
	}
	public String getPicture() {
		return picture;
	}
	public void setPicture(String picture) {
		this.picture = picture;
	}
	public String getLocalPicture() {
		return localPicture;
	}
	public void setLocalPicture(String localPicture) {
		this.localPicture = localPicture;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	@Override
	public String toString() {
		return "HomePictureVO [terminalId=" + terminalId + ", picture="
				+ picture + ", localPicture=" + localPicture + ", type=" + type
				+ "]";
	}
	
	
}
