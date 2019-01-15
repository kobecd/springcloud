package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;

/**
 * 模板首页头图信息
 * @author user
 *
 */
public class TemplateHomePictureVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 顶部图片在线地址
	 */
	private String picture;
	/**
	 * 顶部图片本地资源地址
	 */
	private String localPicture;
	/**
	 * 首页类型1：标准首页 2：店铺导购
	 */
	private String type;//1 标准首页，2 商场导购

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
		return "TemplateHomePictureVO [picture=" + picture + ", localPicture="
				+ localPicture + ", type=" + type + "]";
	}
	
}
