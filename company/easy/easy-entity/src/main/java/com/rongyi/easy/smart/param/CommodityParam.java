package com.rongyi.easy.smart.param;


/**
 * Created by yandong on 2017/11/14.
 */
public class CommodityParam extends BaseParam {

    private Integer pageId;

    private Integer caseLayerId;

    private Integer categoryId;

    private Integer state;

    private Integer from;

    private Integer categoryCommodityId;//分类关联商品id

    public Integer getCategoryCommodityId() {
        return categoryCommodityId;
    }

    public void setCategoryCommodityId(Integer categoryCommodityId) {
        this.categoryCommodityId = categoryCommodityId;
    }

    public Integer getFrom() {
        return from;
    }

    public void setFrom(Integer from) {
        this.from = from;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(Integer categoryId) {
        this.categoryId = categoryId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getCaseLayerId() {
        return caseLayerId;
    }

    public void setCaseLayerId(Integer caseLayerId) {
        this.caseLayerId = caseLayerId;
    }

    @Override
    public String toString() {
        return "CommodityParam{" +
                "pageId=" + pageId +
                ", caseLayerId=" + caseLayerId +
                ", categoryId=" + categoryId +
                ", state=" + state +
                ", from=" + from +
                ", categoryCommodityId=" + categoryCommodityId +
                "} " + super.toString();
    }
}
