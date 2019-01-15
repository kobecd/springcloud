package com.rongyi.easy.smart.entity;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/19.
 */
public class CasePage implements Serializable {

    private Integer id;
    private String mallId;
    private Integer caseId;
    private Integer layoutId;
    private String layoutName;
    private Integer createAt;
    private String createBy;
    private String updateBy;
    private Integer updateAt;
    private Integer state;

    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

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

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
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

    public Integer getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Integer updateAt) {
        this.updateAt = updateAt;
    }


    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
    }
}
