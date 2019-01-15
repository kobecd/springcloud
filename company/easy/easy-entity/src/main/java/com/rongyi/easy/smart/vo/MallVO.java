package com.rongyi.easy.smart.vo;

import java.io.Serializable;

import com.rongyi.easy.bdata.vo.MallAddressVO;

public class MallVO implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String id;//商场ID
    private String name;//商场名称
    private MallAddressVO mallAddress;//商场地址
    private String description;//商场介绍
    private String ename;    //商场英文名称
    private String descriptionEn;//商场英文介绍
    
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
	public MallAddressVO getMallAddress() {
		return mallAddress;
	}
	public void setMallAddress(MallAddressVO mallAddress) {
		this.mallAddress = mallAddress;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getDescriptionEn() {
		return descriptionEn;
	}
	public void setDescriptionEn(String descriptionEn) {
		this.descriptionEn = descriptionEn;
	}
	@Override
	public String toString() {
		return "MallVO [id=" + id + ", name=" + name + ", mallAddress="
				+ mallAddress + ", description=" + description + ", ename="
				+ ename + ", descriptionEn=" + descriptionEn + "]";
	}
    
}
