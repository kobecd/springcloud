package com.rongyi.easy.ryoms.merchant.vo;

import com.rongyi.easy.bsoms.entity.BIndustryVersion;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class VersionIndustryVO extends BIndustryVersion implements Serializable {

	private static final long serialVersionUID = 8149365561835250043L;

	private Integer id;
	private String name;
	private Integer industryId;
	private String industryName;
	private Date createAt;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	public Integer getIndustryId() {
		return industryId;
	}
	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}
	public String getIndustryName() {
		return industryName;
	}
	public void setIndustryIdName(String industryName) {
		this.industryName = industryName;
	}
	public Date getCreateAt() {
		return createAt;
	}
	public void setCreateAt(Date createAt) {
		this.createAt = createAt;
	}

	
	
	
}
