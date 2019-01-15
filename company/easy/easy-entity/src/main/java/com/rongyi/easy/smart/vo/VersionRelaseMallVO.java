package com.rongyi.easy.smart.vo;

import java.io.Serializable;
/**
 * 版本发布可选商场列表VO
 * @author user
 *
 */
public class VersionRelaseMallVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//商场id
	private String name;//商场名称
	private boolean hasRelease;//是否发布
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
	public boolean isHasRelease() {
		return hasRelease;
	}
	public void setHasRelease(boolean hasRelease) {
		this.hasRelease = hasRelease;
	}
	@Override
	public String toString() {
		return "VersionRelaseMallVO [id=" + id + ", name=" + name
				+ ", hasRelease=" + hasRelease + "]";
	}
	
}
