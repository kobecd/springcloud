package com.rongyi.easy.smart.entity;

import java.io.Serializable;

public class MallModuleRecordEntity implements Serializable{
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private Integer id;

    private String mallId;

    private String mallName;

    private Integer layoutId;

    private String layoutName;

    private String direction;

    private String logo;

    private String createBy;

    private Integer createAt;

    private String updateBy;

    private Integer updateAt;

    private String updateAtDate;

    private String createAtDate;

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

    public Integer getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(Integer layoutId) {
        this.layoutId = layoutId;
    }

    public String getLayoutName() {
        return layoutName;
    }

    public void setLayoutName(String layoutName) {
        this.layoutName = layoutName;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Integer getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Integer createAt) {
        this.createAt = createAt;
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

    public String getMallName() {
        return mallName;
    }

    public void setMallName(String mallName) {
        this.mallName = mallName;
    }

    public String getUpdateAtDate() {
        return updateAtDate;
    }

    public void setUpdateAtDate(String updateAtDate) {
        this.updateAtDate = updateAtDate;
    }

    public String getCreateAtDate() {
        return createAtDate;
    }

    public void setCreateAtDate(String createAtDate) {
        this.createAtDate = createAtDate;
    }

    public String getDirection() {
        return direction;
    }

    public void setDirection(String direction) {
        this.direction = direction;
    }

    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }
}