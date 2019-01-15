package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;
import java.util.List;

/**
 * 模板数据信息VO
 * @author user
 *
 */
public class TemplateDataVO implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 模板ID
	 */
	private String templateId;
	/**
	 * 模板下的数据列表
	 */
	private List<?> data;

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	
	public List<?> getData() {
		return data;
	}

	public void setData(List<?> data) {
		this.data = data;
	}

	@Override
	public String toString() {
		return "TemplateDataVO [templateId=" + templateId + ", data=" + data
				+ "]";
	}
	
}
