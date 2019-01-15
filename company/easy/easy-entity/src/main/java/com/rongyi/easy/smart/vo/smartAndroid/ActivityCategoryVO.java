package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;

public class ActivityCategoryVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/**
     * ID
     */
    private String id;
    
    /**
     * 活动分类名称
     */
    private String name;

    /**
     * 排序字段 越小越靠前
     */
    private int sort;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "ActivityCategoryVO [id=" + id + ", name=" + name + ", sort="
				+ sort + "]";
	}
    
    
}
