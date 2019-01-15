package com.rongyi.easy.mcmc.param;

import java.io.Serializable;

/**
 * @author Created By lds on 2017-10-24
 */
public class CommodityShopSortParam implements Serializable{
    private String commodityId;
    private Integer shopSort = 0;

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getShopSort() {
        return shopSort;
    }

    public void setShopSort(Integer shopSort) {
        this.shopSort = shopSort;
    }
}
