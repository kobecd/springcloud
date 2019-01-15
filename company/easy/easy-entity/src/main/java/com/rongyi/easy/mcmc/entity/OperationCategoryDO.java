package com.rongyi.easy.mcmc.entity;

import com.rongyi.easy.mcmc.param.OperationCategoryParam;
import org.apache.commons.lang.StringUtils;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.springframework.util.Assert;

import java.util.Date;

/**
 * Created by WUH on 2017/5/26.
 * 商品运营类目DO
 */
@Entity(value="mcmc_operation_category",noClassnameStored=true)
public class OperationCategoryDO extends BaseDO {

    private String name; //运营类目名称

    private String remark;  //备注说明

    private String picture;  //图片

    private ObjectId shop_id; //店铺Id

//    private ObjectId parent_shop_id; //父级店铺id

    private int shop_type;  //店铺类型 1:商场, 2:总部, 3:店铺

    private Integer sort;

    private ObjectId parent_id;  //父类目id

    public OperationCategoryDO(){}

    public OperationCategoryDO(OperationCategoryParam param){
        Assert.notNull(param);
        this.setName(param.getName());
        this.setRemark(param.getRemark());
        this.setPicture(param.getPicture());
        if(StringUtils.isNotBlank(param.getId())){
            this.set_id(new ObjectId(param.getId()));
        }
        if(StringUtils.isBlank(param.getShopId())){
            if(StringUtils.isNotBlank(param.getZoneId())){   //商场账号
                this.setShop_id(new ObjectId(param.getZoneId()));
                this.setShop_type(1);
            }else{
                throw new IllegalArgumentException("shopId不能为空");
            }
        }else{
            if(StringUtils.isBlank(param.getParentShopId()) && StringUtils.isBlank(param.getZoneId())){
                this.setShop_type(2);  //总部
            }else{
                this.setShop_type(3);   //店铺
            }
            this.setShop_id(new ObjectId(param.getShopId()));
        }

        if(StringUtils.isNotBlank(param.getParentId())){
            this.setParent_id(new ObjectId(param.getParentId()));
        }
        this.setCreate_by(param.getCreateBy());
        this.setCreate_at(new Date());
        this.setUpdate_by(param.getUpdateBy());
        this.setUpdate_at(new Date());
    }

    public int getShop_type() {
        return shop_type;
    }

    public void setShop_type(int shop_type) {
        this.shop_type = shop_type;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public ObjectId getParent_id() {
        return parent_id;
    }

    public void setParent_id(ObjectId parent_id) {
        this.parent_id = parent_id;
    }

    public ObjectId getShop_id() {
        return shop_id;
    }

    public void setShop_id(ObjectId shop_id) {
        this.shop_id = shop_id;
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
