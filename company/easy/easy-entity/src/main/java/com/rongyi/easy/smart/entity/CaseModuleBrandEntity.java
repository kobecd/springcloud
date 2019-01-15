package com.rongyi.easy.smart.entity;

import java.util.List;

public class CaseModuleBrandEntity {
    private Integer id;

    private String mallId;

    private Integer caseId;

    private Byte style;

    private Byte sort;

    private String createBy;

    private String updateBy;

    private Integer createAt;

    private Integer updateAt;

    private String customLogo;

    private List category;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getCaseId() {
        return caseId;
    }

    public void setCaseId(Integer caseId) {
        this.caseId = caseId;
    }

    public Byte getStyle() {
        return style;
    }

    public void setStyle(Byte style) {
        this.style = style;
    }

    public Byte getSort() {
        return sort;
    }

    public void setSort(Byte sort) {
        this.sort = sort;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
    }

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }

    public String getCustomLogo() {
        return customLogo;
    }

    public void setCustomLogo(String customLogo) {
        this.customLogo = customLogo;
    }

    public List getCategory() {
        return category;
    }

    public void setCategory(List category) {
        this.category = category;
    }
}