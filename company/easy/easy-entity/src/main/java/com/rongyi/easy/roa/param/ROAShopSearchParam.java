package com.rongyi.easy.roa.param;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * Created With IntelliJ IDEA.
 *
 * @author: WUHUI
 * @date: 2017/10/26
 */
public class ROAShopSearchParam implements Serializable{
    private static final long serialVersionUID = 1L;

    private String parentMerchantId;

    private boolean isAccurate = false;

    private String name;

    private Integer currentPage = null;

    private Integer pageSize = null;

    private String floorId;

    private String acronym;

    private Boolean newShop;
    /**
     * 自定义分类列表
     */
    private String customCategoryId;

    public String getCustomCategoryId() {
        return customCategoryId;
    }

    public void setCustomCategoryId(String customCategoryId) {
        this.customCategoryId = customCategoryId;
    }

    public Boolean getNewShop() {
        return newShop;
    }

    public void setNewShop(Boolean newShop) {
        this.newShop = newShop;
    }

    public String getAcronym() {
        return acronym;
    }

    public void setAcronym(String acronym) {
        this.acronym = acronym;
    }

    public String getFloorId() {
        return floorId;
    }

    public void setFloorId(String floorId) {
        this.floorId = floorId;
    }

    public String getParentMerchantId() {
        return parentMerchantId;
    }

    public void setParentMerchantId(String parentMerchantId) {
        this.parentMerchantId = parentMerchantId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentPage() {
        return currentPage;
    }

    public void setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public boolean isAccurate() {
        return isAccurate;
    }

    public void setAccurate(boolean accurate) {
        isAccurate = accurate;
    }

    @Override
    public String toString(){
        return ReflectionToStringBuilder.toString(this);
    }
}
