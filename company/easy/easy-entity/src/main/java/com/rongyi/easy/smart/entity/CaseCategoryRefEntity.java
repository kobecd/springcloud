package com.rongyi.easy.smart.entity;

import java.io.Serializable;
import java.util.Date;

public class CaseCategoryRefEntity implements Serializable {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id; 

    private Integer caseId;

    private Integer caseCategoryId;

    private Date createAt;

    private String createBy;

    private Date updateAt;

    private String updateBy;

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

    public Integer getCaseCategoryId() {
        return caseCategoryId;
    }

    public void setCaseCategoryId(Integer caseCategoryId) {
        this.caseCategoryId = caseCategoryId;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }
}