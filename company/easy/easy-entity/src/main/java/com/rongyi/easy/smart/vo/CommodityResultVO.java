package com.rongyi.easy.smart.vo;

import java.util.List;

/**
 * Created by yandong on 2017/11/21.
 */
public class CommodityResultVO {

    private Long total;

    private List<CommodityVO> commodityVOList;


    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public List<CommodityVO> getCommodityVOList() {
        return commodityVOList;
    }

    public void setCommodityVOList(List<CommodityVO> commodityVOList) {
        this.commodityVOList = commodityVOList;
    }
}
