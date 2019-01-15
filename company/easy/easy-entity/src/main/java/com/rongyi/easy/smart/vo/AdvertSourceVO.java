package com.rongyi.easy.smart.vo;

import java.io.Serializable;

public class AdvertSourceVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer sourceId;//素材ID
	private String url;//素材对应的url
	private String attribute;//素材比例
	private Integer adType;//类型， 1 图片， 2 视频, 3 GIF图片'
	
	public Integer getSourceId() {
		return sourceId;
	}
	public void setSourceId(Integer sourceId) {
		this.sourceId = sourceId;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}

	public String getAttribute() {
		return attribute;
	}

	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}

	public Integer getAdType() {
		return adType;
	}

	public void setAdType(Integer adType) {
		this.adType = adType;
	}

	@Override
	public String toString() {
		return "AdvertSourceVO{" +
				"sourceId=" + sourceId +
				", url='" + url + '\'' +
				", attribute='" + attribute + '\'' +
				", adType=" + adType +
				'}';
	}


}
