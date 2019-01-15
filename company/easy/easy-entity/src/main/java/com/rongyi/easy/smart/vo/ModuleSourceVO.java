package com.rongyi.easy.smart.vo;

import java.io.Serializable;

/**
 * 图层资源信息VO
 * @author user
 *
 */
public class ModuleSourceVO implements Serializable {


	private static final long serialVersionUID = 3493892426042141657L;
	private Integer id;
	/**
	 * 资源路径
	 */
	private String url;
	/**
	 * 类型:1 图片， 2 视频, 3 flash
	 */
	private Integer type;
	/**
	 * 名称
	 */
	private String name;
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getUrl() {
		return url;
	}
	public void setUrl(String url) {
		this.url = url;
	}
	public Integer getType() {
		return type;
	}
	public void setType(Integer type) {
		this.type = type;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "ModuleSourceVO [id=" + id + ", url=" + url + ", type=" + type
				+ ", name=" + name + "]";
	}
	
	
	
}
