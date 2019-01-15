package com.rongyi.easy.smart.vo.launcher;

import java.io.Serializable;

/**
 * 
 * @author user
 *
 */
public class ScheduleDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 排期表ID
	 */
	private String scheduleId;
	/**
	 * 模板ID
	 */
	private String template;
	
	public String getScheduleId() {
		return scheduleId;
	}
	public void setScheduleId(String scheduleId) {
		this.scheduleId = scheduleId;
	}
	public String getTemplate() {
		return template;
	}
	public void setTemplate(String template) {
		this.template = template;
	}
	@Override
	public String toString() {
		return "ScheduleDeleteVO [scheduleId=" + scheduleId + ", template="
				+ template + "]";
	}
	
}
