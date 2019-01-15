package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;

/**
 * 安卓标准版应用模板数据删除VO
 * 2017/12/29
 * @author user
 *
 */
public class ModuleDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * 模板ID
	 */
	private String templateId;
	
	/**
	 * 删除的数据ID集合
	 */
	private List<?> deleteData;

	public String getTemplateId() {
		return templateId;
	}

	public void setTemplateId(String templateId) {
		this.templateId = templateId;
	}

	public List<?> getDeleteData() {
		return deleteData;
	}

	public void setDeleteData(List<?> deleteData) {
		this.deleteData = deleteData;
	}

	@Override
	public String toString() {
		return "ModuleDeleteVO [templateId=" + templateId + ", deleteData="
				+ deleteData + "]";
	}
	
}
