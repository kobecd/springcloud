package com.rongyi.easy.ryoms.merchant.param;

import java.io.Serializable;
import java.util.List;

/** 
 * @ClassName: IndustryVersionParam 
 * @Description: 
 * @author Kenny
 * @date 2016年10月24日 下午6:26:28 
 *  
 */
public class IndustryVersionParam implements Serializable {
	private static final long serialVersionUID = 2905367200197306832L;
	
	
	private Integer id;
	
	private String name;//版本名称
	
	private List<Integer> auths;//权限值

	private Integer industryId;//上层行业id
	private String industryName;//行业名称

	private int currentPage = 0;//当前页
	private int pageSize =0;//总页数

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

	public String getIndustryName() {
		return industryName;
	}

	public void setIndustryName(String industryName) {
		this.industryName = industryName;
	}
	public int getCurrentPage() {
		return currentPage;
	}
	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}
	public int getPageSize() {
		return pageSize;
	}
	public void setPageSize(int pageSize) {
		this.pageSize = pageSize;
	}
	public List<Integer> getAuths() {
		return auths;
	}

	public void setAuths(List<Integer> auths) {
		this.auths = auths;
	}

	public Integer getIndustryId() {
		return industryId;
	}

	public void setIndustryId(Integer industryId) {
		this.industryId = industryId;
	}

	@Override
	public String toString() {
		return "IndustryVersionParam [id=" + id + ", name=" + name + ", auths=" + auths + ", industryId=" + industryId
				+ "]";
	}

}
