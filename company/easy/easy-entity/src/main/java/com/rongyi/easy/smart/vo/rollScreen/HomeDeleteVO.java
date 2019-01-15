package com.rongyi.easy.smart.vo.rollScreen;

import java.io.Serializable;
import java.util.List;

/**
 * 电子易拉宝删除的图层id
 * @author user
 *
 */
public class HomeDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 模板ID
	 */
	private String templateId;
	/**
	 * 删除的图层ID
	 */
	private List<String> deleteHome;
	
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public List<String> getDeleteHome() {
		return deleteHome;
	}
	public void setDeleteHome(List<String> deleteHome) {
		this.deleteHome = deleteHome;
	}
	@Override
	public String toString() {
		return "DeleteHomeVO [templateId=" + templateId + ", deleteHome="
				+ deleteHome + "]";
	}
	
}
