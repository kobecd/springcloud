package com.rongyi.easy.mcmc.vo;

import com.rongyi.easy.mcmc.entity.OperationCategoryDO;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.bson.types.ObjectId;

import java.io.Serializable;
import java.util.Date;

/**
 * Created by WUH on 2017/6/1.
 */
public class OperationCategoryVO implements Serializable {
    private String id;

    private String parentId;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

    private Integer valid;   //0:正常, 1:删除

    private String name; //运营类目名称

    private String remark;  //备注说明

    private String picture; //图片

    private String shopId; //店铺Id

    private Integer sort;

    private int shopType; //店铺类型 1:商场, 2:总部, 3:店铺
    public OperationCategoryVO(OperationCategoryDO categoryDO){
        this.setId(categoryDO.get_id().toString());
        if(categoryDO.getParent_id() != null){
            this.setParentId(categoryDO.getParent_id().toString());
        }
        this.setShopId(categoryDO.getShop_id().toString());
        this.setSort(categoryDO.getSort());
        this.setName(categoryDO.getName());
        this.setRemark(categoryDO.getRemark());
        this.setPicture(categoryDO.getPicture());
        this.setCreateAt(categoryDO.getCreate_at());
        this.setCreateBy(categoryDO.getCreate_by());
        this.setUpdateAt(categoryDO.getUpdate_at());
        this.setUpdateBy(categoryDO.getUpdate_by());
        this.setShopType(categoryDO.getShop_type());
    }

    public int getShopType() {
        return shopType;
    }

    public void setShopType(int shopType) {
        this.shopType = shopType;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

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

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getValid() {
        return valid;
    }

    public void setValid(Integer valid) {
        this.valid = valid;
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
