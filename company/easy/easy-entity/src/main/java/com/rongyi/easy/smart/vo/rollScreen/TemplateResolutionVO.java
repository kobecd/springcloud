package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;


/**
 * 模板分辨率
 * @author user
 *
 */
public class TemplateResolutionVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 模板ID
	 */
	private String templateId;
	/**
	 * 分辨率
	 */
	private String resolution;
	
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public String getResolution() {
		return resolution;
	}
	public void setResolution(String resolution) {
		this.resolution = resolution;
	}
	@Override
	public String toString() {
		return "TemplateResolutionVO [templateId=" + templateId
				+ ", resolution=" + resolution + "]";
	}
	
}
