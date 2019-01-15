package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
import java.util.List;
/**
 * 安卓应用删除数据
 * 2017/12/29
 * @author user
 *
 */
public class AndroidModuleDeleteVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * 分类删除数据
	 */
	private List<ModuleDeleteVO> categories;
	/**
	 * 精彩活动删除数据
	 */
	private List<ModuleDeleteVO> activities;
	
	public List<ModuleDeleteVO> getCategories() {
		return categories;
	}
	public void setCategories(List<ModuleDeleteVO> categories) {
		this.categories = categories;
	}
	public List<ModuleDeleteVO> getActivities() {
		return activities;
	}
	public void setActivities(List<ModuleDeleteVO> activities) {
		this.activities = activities;
	}
	@Override
	public String toString() {
		return "AndroidModuleDeleteVO [categories=" + categories
				+ ", activities=" + activities + "]";
	}
	
}
