package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.List;

/**
 * 电子货架商品参数类
 * @author user
 *
 */
public class SmartCommodityParam extends BaseParam implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	private String commodityId;//商品id
	private String categoryId;//3级分类id
    private Integer status;//状态 0下架 1上架 2是删除3待上架4待处理 -1表示所有
    private String keyword;
    private Integer commodityCategoryId;//商品分类id
    private Integer terminalType;//上架终端  1互动屏
	private List<String> categoryIdList;
	private Integer from;//1 容易网， 2 奥普直购
	private Integer caseLayerId;//图层id

	public Integer getCaseLayerId() {
		return caseLayerId;
	}

	public void setCaseLayerId(Integer caseLayerId) {
		this.caseLayerId = caseLayerId;
	}

	public Integer getFrom() {
		return from;
	}

	public void setFrom(Integer from) {
		this.from = from;
	}

	public Integer getCommodityCategoryId() {
		return commodityCategoryId;
	}

	public void setCommodityCategoryId(Integer commodityCategoryId) {
		this.commodityCategoryId = commodityCategoryId;
	}

	public String getCommodityId() {
		return commodityId;
	}
	public void setCommodityId(String commodityId) {
		this.commodityId = commodityId;
	}
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public Integer getStatus() {
		return status;
	}
	public void setStatus(Integer status) {
		this.status = status;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	public Integer getTerminalType() {
		return terminalType;
	}
	public void setTerminalType(Integer terminalType) {
		this.terminalType = terminalType;
	}

	public List<String> getCategoryIdList() {
		return categoryIdList;
	}

	public void setCategoryIdList(List<String> categoryIdList) {
		this.categoryIdList = categoryIdList;
	}

	@Override
	public String toString() {
		return "SmartCommodityParam{" +
				"commodityId='" + commodityId + '\'' +
				", categoryId='" + categoryId + '\'' +
				", status=" + status +
				", keyword='" + keyword + '\'' +
				", commodityCategoryId=" + commodityCategoryId +
				", terminalType=" + terminalType +
				", categoryIdList=" + categoryIdList +
				"} " + super.toString();
	}
}
