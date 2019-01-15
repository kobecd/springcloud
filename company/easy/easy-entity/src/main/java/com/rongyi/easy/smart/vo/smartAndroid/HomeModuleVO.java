package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;

public class HomeModuleVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
     * ID
     */
	private String id;
	 /**
     * 功能模块显示名称
     */
    private String name;

    /**
     * 默认图标图片网络地址
     */
    private String icon;

    /**
     * 默认图标本地地址
     */
    private String localIcon;

    /**
     * 图标选中图片网络地址
     */
    private String iconPress;

    /**
     * 图标选中图片本地地址
     */
    private String localIconPress;
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
	public String getIcon() {
		return icon;
	}
	public void setIcon(String icon) {
		this.icon = icon;
	}
	public String getLocalIcon() {
		return localIcon;
	}
	public void setLocalIcon(String localIcon) {
		this.localIcon = localIcon;
	}
	public String getIconPress() {
		return iconPress;
	}
	public void setIconPress(String iconPress) {
		this.iconPress = iconPress;
	}
	public String getLocalIconPress() {
		return localIconPress;
	}
	public void setLocalIconPress(String localIconPress) {
		this.localIconPress = localIconPress;
	}
	public int getSort() {
		return sort;
	}
	public void setSort(int sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "HomeModuleVO [id=" + id + ", name=" + name + ", icon=" + icon
				+ ", localIcon=" + localIcon + ", iconPress=" + iconPress
				+ ", localIconPress=" + localIconPress + ", sort=" + sort + "]";
	}
    
}
