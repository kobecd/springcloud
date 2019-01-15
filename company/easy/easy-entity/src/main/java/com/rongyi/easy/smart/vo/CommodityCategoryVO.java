package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.CommodityCategory;

/**
 * Created by yandong on 2017/11/13.
 */
public class CommodityCategoryVO extends CommodityCategory {


    private String sourceUrl;//关联的图片url
    private Integer commodityNum;//包含商品数

    private Integer easyCommodityNum;

    private Integer aopuCommodityNum;

    public Integer getEasyCommodityNum() {
        return easyCommodityNum;
    }

    public void setEasyCommodityNum(Integer easyCommodityNum) {
        this.easyCommodityNum = easyCommodityNum;
    }

    public Integer getAopuCommodityNum() {
        return aopuCommodityNum;
    }

    public void setAopuCommodityNum(Integer aopuCommodityNum) {
        this.aopuCommodityNum = aopuCommodityNum;
    }

    public String getSourceUrl() {
        return sourceUrl;
    }

    public void setSourceUrl(String sourceUrl) {
        this.sourceUrl = sourceUrl;
    }

    public Integer getCommodityNum() {
        return commodityNum;
    }

    public void setCommodityNum(Integer commodityNum) {
        this.commodityNum = commodityNum;
    }
}
