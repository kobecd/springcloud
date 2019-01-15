package com.rongyi.easy.smart.vo.custom;

import java.io.Serializable;

/**
 * 定制版作品数据
 * @author user
 *
 */
public class CustomTemplateDataVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 模板ID  非作品id  对应case表的ID
	 */
	private String templateId;
	/**
	 * 模板下的数据列表
	 */
	private Object pageContent;
	
	private Object pageList;
	
	private Object globalData;
	
	public String getTemplateId() {
		return templateId;
	}
	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}
	public Object getPageContent() {
		return pageContent;
	}
	public void setPageContent(Object pageContent) {
		this.pageContent = pageContent;
	}
	
	public Object getPageList() {
		return pageList;
	}
	public void setPageList(Object pageList) {
		this.pageList = pageList;
	}
	public Object getGlobalData() {
		return globalData;
	}
	public void setGlobalData(Object globalData) {
		this.globalData = globalData;
	}
	@Override
	public String toString() {
		return "CustomTemplateDataVO [templateId=" + templateId
				+ ", pageContent=" + pageContent + ", pageList=" + pageList
				+ ", globalData=" + globalData + "]";
	}
	
}
