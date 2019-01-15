package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;

public class AppThemeVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 功能模块ID
	 */
	private String id;
	/**
	 * 主题ID
	 */
	private String themeId;
	/**
	 * 对应主题ID的功能样式描述
	 */
    private String themeDescription;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getThemeId() {
		return themeId;
	}

	public void setThemeId(String themeId) {
		this.themeId = themeId;
	}

	public String getThemeDescription() {
		return themeDescription;
	}

	public void setThemeDescription(String themeDescription) {
		this.themeDescription = themeDescription;
	}

	@Override
	public String toString() {
		return "AppThemeVO [id=" + id + ", themeId=" + themeId
				+ ", themeDescription=" + themeDescription + "]";
	}
    
    
}
