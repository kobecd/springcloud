package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
/**
 * 店铺自定义分类
 * @author user
 *
 */
public class MallCategoryVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;
	/**
     * 分类名字
     */
    private String name;

    /**
     * 分类ICON在线图片资源地址
     */
    private String icon;

    /**
     * 分类ICON本地图片资源相对路径
     */
    private String localIcon;
    private Integer sort;//排序
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
	public Integer getSort() {
		return sort;
	}
	public void setSort(Integer sort) {
		this.sort = sort;
	}
	@Override
	public String toString() {
		return "MallCategoryVO [id=" + id + ", name=" + name + ", icon=" + icon
				+ ", localIcon=" + localIcon + ", sort=" + sort + "]";
	}
    
}
