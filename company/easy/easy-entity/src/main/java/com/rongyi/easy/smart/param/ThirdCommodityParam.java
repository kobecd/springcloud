package com.rongyi.easy.smart.param;

import java.io.Serializable;
import java.util.List;

public class ThirdCommodityParam implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	/**
	 * 分类id
	 */
	private String categoryId;
	/**
	 * 抓取时间
	 */
	private String createTime;
	/**
	 * 	商品ID
	 */
	private List<String> goodsId;
	/**
	 * 商品名称[模糊搜素]
	 */
	private String name;
	/**
	 * 	页码
	 */
	private String page;
	/**
	 * 	每页数量[默认:20]
	 */
	private String pagesize;
	/**
	 * 状态:0下架 1上架
	 */
	private String status;
	/**
	 * 	修改时间
	 */
	private String updateTime;
	
	public String getCategoryId() {
		return categoryId;
	}
	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}

	public static long getSerialVersionUID() {
		return serialVersionUID;
	}

	public List<String> getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(List<String> goodsId) {
		this.goodsId = goodsId;
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPage() {
		return page;
	}
	public void setPage(String page) {
		this.page = page;
	}
	public String getPagesize() {
		return pagesize;
	}
	public void setPagesize(String pagesize) {
		this.pagesize = pagesize;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getUpdateTime() {
		return updateTime;
	}
	public void setUpdateTime(String updateTime) {
		this.updateTime = updateTime;
	}
	@Override
	public String toString() {
		return "ThirdCommodityParam [categoryId=" + categoryId
				+ ", createTime=" + createTime + ", goodsId=" + goodsId
				+ ", name=" + name + ", page=" + page + ", pagesize="
				+ pagesize + ", status=" + status + ", updateTime="
				+ updateTime + "]";
	}
	
}
