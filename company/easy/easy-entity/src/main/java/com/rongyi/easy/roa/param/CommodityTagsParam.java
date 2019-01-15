package com.rongyi.easy.roa.param;

import com.rongyi.easy.malllife.param.MalllifeBaseParam;

import java.io.Serializable;

/**
 * @author Created By lds on 2017-10-30
 */
public class CommodityTagsParam extends MalllifeBaseParam implements Serializable {

    private String mallId;//商场id

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }
}
