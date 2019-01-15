package com.rongyi.easy.smart.param;

import java.io.Serializable;

public class VersionViewParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private Integer id;//版本列表主键id
	private Integer status;//1 已完成，2 升级中
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "VersionViewParam [id=" + id + ", status=" + status + "]";
	}
	
}
