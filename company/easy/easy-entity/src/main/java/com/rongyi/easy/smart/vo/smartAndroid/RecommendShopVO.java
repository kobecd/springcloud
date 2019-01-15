package com.rongyi.easy.smart.vo.smartAndroid;

import java.io.Serializable;
/**
 * 推荐店铺VO
 * @author user
 *
 */
public class RecommendShopVO implements Serializable {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
     * ID
     */
	private String id;
	
	/**
     * 推荐的店铺ID
     */
    private String shopId;

    /**
     * 分类ID
     */
    private String categoryId;

    /**
     * 楼层ID
     */
    private String floorId;
    
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

	public String getShopId() {
		return shopId;
	}

	public void setShopId(String shopId) {
		this.shopId = shopId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getFloorId() {
		return floorId;
	}

	public void setFloorId(String floorId) {
		this.floorId = floorId;
	}

	public int getSort() {
		return sort;
	}

	public void setSort(int sort) {
		this.sort = sort;
	}

	@Override
	public String toString() {
		return "RecommendShopVO [id=" + id + ", shopId=" + shopId
				+ ", categoryId=" + categoryId + ", floorId=" + floorId
				+ ", sort=" + sort + "]";
	}
    
}
