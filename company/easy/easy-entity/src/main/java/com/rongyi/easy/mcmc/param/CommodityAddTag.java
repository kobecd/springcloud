package com.rongyi.easy.mcmc.param;

import java.io.Serializable;
import java.util.List;

/**
 * 商品打标签
 * @author zhengling
 * @date 2017/10/27
 */
public class CommodityAddTag implements Serializable {

    /**
     * 商品总表的id号,可以批量给商品打标签所以类型是List
     */
    private List<String> commodityIds;

    /**
     * 标签的id号,一个商品可以打多个标签,关联CommodityTag的id,只存放的叶节点
     */
    private List<String> tagIds;

    /**
     * 商品所属的标签,关联CommodityTag的id,包含父级节点的id
     */
    private List<String> commodityTagAllIds;

    /**
     * 店铺id
     */
    private String shopMid;

    public List<String> getCommodityIds() {
        return commodityIds;
    }

    public void setCommodityIds(List<String> commodityIds) {
        this.commodityIds = commodityIds;
    }

    public List<String> getTagIds() {
        return tagIds;
    }

    public void setTagIds(List<String> tagIds) {
        this.tagIds = tagIds;
    }

    public List<String> getCommodityTagAllIds() {
        return commodityTagAllIds;
    }

    public void setCommodityTagAllIds(List<String> commodityTagAllIds) {
        this.commodityTagAllIds = commodityTagAllIds;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }

    @Override
    public String toString() {
        StringBuffer bufferStr=new StringBuffer();
        bufferStr.append("commodityIds:"+this.getCommodityIds()).append(",");
        bufferStr.append("tagIds:"+this.getTagIds());
        return bufferStr.toString();
    }
}
