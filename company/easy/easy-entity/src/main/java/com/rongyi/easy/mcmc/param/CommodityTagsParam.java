package com.rongyi.easy.mcmc.param;

/**
 * @author Created By lds on 2017-10-30
 */
public class CommodityTagsParam {

    private boolean isShowAll = true;//是否展开所有分类
    private String shopMid;//总店Id

    public boolean isShowAll() {
        return isShowAll;
    }

    public void setShowAll(boolean showAll) {
        isShowAll = showAll;
    }

    public String getShopMid() {
        return shopMid;
    }

    public void setShopMid(String shopMid) {
        this.shopMid = shopMid;
    }
}
