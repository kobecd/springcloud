package com.rongyi.easy.osm.vo;

import java.io.Serializable;

/**
 * 合适的运费模板
 *
 * @author wangjh7
 * @date 2017-06-17
 **/
public class ExpressTemplateVO implements Serializable {
    private Double basicWeight; //< 首重
    private Double basicPrice; //< 首重的金额
    private Double nextWeight; //< 续重
    private Double nextPrice; ///< 续重的金额
    private String commodityId;///< 商品ID
    private String skuId;///< 商品SKUID
    private Double weight; ///< 商品总量

    public Double getBasicPrice() {
        return basicPrice;
    }

    public void setBasicPrice(Double basicPrice) {
        this.basicPrice = basicPrice;
    }

    public Double getBasicWeight() {
        return basicWeight;
    }

    public void setBasicWeight(Double basicWeight) {
        this.basicWeight = basicWeight;
    }

    public Double getNextPrice() {
        return nextPrice;
    }

    public void setNextPrice(Double nextPrice) {
        this.nextPrice = nextPrice;
    }

    public Double getNextWeight() {
        return nextWeight;
    }

    public void setNextWeight(Double nextWeight) {
        this.nextWeight = nextWeight;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public String getSkuId() {
        return skuId;
    }

    public void setSkuId(String skuId) {
        this.skuId = skuId;
    }

    @Override
    public String toString() {
        return "ExpressTemplateVO{" +
                "basicPrice=" + basicPrice +
                ", basicWeight=" + basicWeight +
                ", nextWeight=" + nextWeight +
                ", nextPrice=" + nextPrice +
                ", commodityId='" + commodityId + '\'' +
                ", skuId='" + skuId + '\'' +
                ", weight=" + weight +
                '}';
    }
}
