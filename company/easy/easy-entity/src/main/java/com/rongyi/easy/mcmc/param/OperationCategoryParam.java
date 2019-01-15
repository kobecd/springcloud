package com.rongyi.easy.mcmc.param;

import org.apache.commons.lang.builder.ReflectionToStringBuilder;

import java.io.Serializable;

/**
 * Created by WUH on 2017/6/1.
 */
public class OperationCategoryParam implements Serializable {
    private String id;

    private String createBy;

    private String updateBy;

    private String name; //运营类目名称

    private String remark;  //备注说明

    private String picture;  //图片

    private String shopId; //店铺Id

    private String zoneId;

    private String parentShopId;  //父级店铺id

    private String parentId; //父级运营类目id

    private Integer sort;

    private Integer direction;  //方向，1：向上移动；-1：向下移动

    private boolean isParentCategory;

    public String getZoneId() {
        return zoneId;
    }

    public void setZoneId(String zoneId) {
        this.zoneId = zoneId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public String getParentShopId() {
        return parentShopId;
    }

    public void setParentShopId(String parentShopId) {
        this.parentShopId = parentShopId;
    }

    public boolean isParentCategory() {
        return isParentCategory;
    }

    public void setParentCategory(boolean parentCategory) {
        isParentCategory = parentCategory;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRemark() {
        return remark;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getShopId() {
        return shopId;
    }

    public void setShopId(String shopId) {
        this.shopId = shopId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return ReflectionToStringBuilder.toString(this);
    }
}
