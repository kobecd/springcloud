package com.rongyi.easy.smart.param;

import java.util.List;

/**
 * Created by yandong on 2017/11/15.
 */
public class CommodityCategoryParam extends BaseParam {

    private Integer caseLayerId; //图层id

    private Integer categoryId;//分类id

    private String commodityId;//商品id

    private Integer from;//1容易网， 2 奥普直购

    private Integer pageId;

    private List<String> commodityIdList;//商品idlist

    private Integer categoryCommodityId;//分类商品id

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getCategoryCommodityId() {
        return categoryCommodityId;
    }

    public void setCategoryCommodityId(Integer categoryCommodityId) {
        this.categoryCommodityId = categoryCommodityId;
    }

    public String getCommodityId() {
        return commodityId;
    }

    public void setCommodityId(String commodityId) {
        this.commodityId = commodityId;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public List<String> getCommodityIdList() {
        return commodityIdList;
    }

    public void setCommodityIdList(List<String> commodityIdList) {
        this.commodityIdList = commodityIdList;
    }

    public Integer getCaseLayerId() {
        return caseLayerId;
    }

    public void setCaseLayerId(Integer caseLayerId) {
        this.caseLayerId = caseLayerId;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    @Override
    public String toString() {
        return "CommodityCategoryParam{" +
                "caseLayerId=" + caseLayerId +
                ", categoryId=" + categoryId +
                ", commodityId='" + commodityId + '\'' +
                ", from=" + from +
                ", pageId=" + pageId +
                ", commodityIdList=" + commodityIdList +
                ", categoryCommodityId=" + categoryCommodityId +
                "} " + super.toString();
    }
}
