package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;
import java.util.List;

/**
 * 删除的排期模板数据
 * @author user
 *
 */
public class TemplateDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 删除的排期模板ID集合
	 */
	private List<ScheduleDeleteVO> templates;
	
	public List<ScheduleDeleteVO> getTemplates() {
		return templates;
	}
	
	public void setTemplates(List<ScheduleDeleteVO> templates) {
		this.templates = templates;
	}

	@Override
	public String toString() {
		return "TemplateDeleteVO [templates=" + templates + "]";
	}
	
}
