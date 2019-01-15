package com.rongyi.easy.smart.vo;

import java.io.Serializable;
import java.util.List;

public class ModuleCaseListVO implements Serializable {

    private Integer sourceId;

    private List<?> sourceCaseList;//资源关联的模板列表

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public List<?> getSourceCaseList() {
        return sourceCaseList;
    }

    public void setSourceCaseList(List<?> sourceCaseList) {
        this.sourceCaseList = sourceCaseList;
    }
}
