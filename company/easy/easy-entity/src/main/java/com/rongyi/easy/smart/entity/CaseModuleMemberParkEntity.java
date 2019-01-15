package com.rongyi.easy.smart.entity;

public class CaseModuleMemberParkEntity {
    private Integer id;

    private String mallId;

    private Integer caseId;

    private Byte style;

    private Byte sortWay;

    private String createBy;

    private String updateBy;

    private Integer createAt;

    private Integer updateAt;

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

    public Byte getSortWay() {
        return sortWay;
    }

    public void setSortWay(Byte sortWay) {
        this.sortWay = sortWay;
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
}