package com.rongyi.easy.mcmc;

import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.Entity;
import org.mongodb.morphia.annotations.Id;

import java.io.Serializable;
import java.util.Date;

/**
 * 商品标签对象
 * @author zhengling
 * @date 2017/10/24
 */
@Entity(value="mcmc_commodity_tag",noClassnameStored=true)
public class CommodityTag implements Serializable {

    private static final long serialVersionUID = -3491400779856182501L;

    @Id
    private ObjectId id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签图片地址
     */
    private String logoUrl;

    /**
     * 直属父类id,第一级节点parentId的值为0
     */
    private String parentId;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 层级，如一级节点，二级节点...
     */
    private Integer floor;

    /**
     * 店铺Id
     */
    private String shopMid;

    /**
     * 创建时间
     */
    private Date createAt;

    /**
     * 创建人
     */
    private Integer createBy;

    /**
     * 更新日期
     */
    private Date updateAt;

    /**
     * 修改人
     */
    private Integer updateBy;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoUrl() {
        return logoUrl;
    }

    public void setLogoUrl(String logoUrl) {
        this.logoUrl = logoUrl;
    }

    public String getParentId() {
        return parentId;
    }

    public void setParentId(String parentId) {
        this.parentId = parentId;
    }

    public Integer getSort() {
        return sort;
    }

    public void setSort(Integer sort) {
        this.sort = sort;
    }

    public Integer getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) {
        this.floor = floor;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Integer getCreateBy() {
        return createBy;
    }

    public void setCreateBy(Integer createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public Integer getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(Integer updateBy) {
        this.updateBy = updateBy;
    }
}

