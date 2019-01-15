package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.CommodityCategoryRef;

/**
 * Created by yandong on 2017/11/24.
 */
public class CommodityCategoryRefVO extends CommodityCategoryRef {

    private Integer caseId;

    private Integer caseLayerId;

    private Integer pageId;

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getCaseLayerId() {
        return caseLayerId;
    }

    public void setCaseLayerId(Integer caseLayerId) {
        this.caseLayerId = caseLayerId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }
}
