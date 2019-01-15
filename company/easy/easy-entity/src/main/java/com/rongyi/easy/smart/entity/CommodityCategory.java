package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by yandong on 2017/11/8.
 */
public class CommodityCategory implements Serializable {

    private Integer id;
    private String name;//分类名称
    private Integer index;//分类顺序
    private Integer caseId;
    private Integer pageId;
    private Integer caseLayerId;
    private Integer sourceId;
    private Integer state;

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }

    public Integer getCaseLayerId() {
        return caseLayerId;
    }

    public void setCaseLayerId(Integer caseLayerId) {
        this.caseLayerId = caseLayerId;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getIndex() {
        return index;
    }

    public void setIndex(Integer index) {
        this.index = index;
    }

}
