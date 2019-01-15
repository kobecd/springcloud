package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * 商品标签对象
 * @author zhengling
 * @date 2017/10/24
 */
public class CommodityTagParam implements Serializable {

    /**
     * 标签id
     */
    private String id;

    /**
     * 标签名称
     */
    private String name;

    /**
     * 标签图片地址
     */
    private String logoUrl;

    /**
     * 直属父类id
     */
    private String parentId;

    /**
     * 排序号
     */
    private Integer sort;

    /**
     * 店铺Id
     */
    private String shopMid;

    public String getId() {
        return id;
    }

    public void setId(String id) {
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

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    @Override
    public String toString() {
        StringBuffer buffer=new StringBuffer("id:"+this.getId()+",name:"+this.getName()+",logoUrl:"+this.getLogoUrl()+",sort:"+this.getSort()+",parentId:"+this.getParentId());
        return buffer.toString();
    }
}
