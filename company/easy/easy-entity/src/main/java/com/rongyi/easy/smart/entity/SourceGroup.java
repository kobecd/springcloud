package com.rongyi.easy.smart.entity;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/16.
 */
public class SourceGroup implements Serializable{

    private Integer id;
    private String name;
    private Integer type;// 1 图片， 2 视频， 3 flash',
    private Integer rank;//排序
    private String mallId;
    private Integer state; //1 正常， 0 删除
    private Integer isDefault;
    private Integer createAt;
    private Integer updateAt;
    private String createBy;
    private String updateBy;
    private Integer module;//所属模块 1 素材， 2 广告
    private Integer isPublic;//是否共有组

    public Integer getModule() {
        return module;
    }

    public void setModule(Integer module) {
        this.module = module;
    }

    public Integer getIsDefault() {
        return isDefault;
    }

    public void setIsDefault(Integer isDefault) {
        this.isDefault = isDefault;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getMallId() {
        return mallId;
    }

    public void setMallId(String mallId) {
        this.mallId = mallId;
    }

    public Integer getState() {
        return state;
    }

    public void setState(Integer state) {
        this.state = state;
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

    public Integer getIsPublic() {
        return isPublic;
    }

    public void setIsPublic(Integer isPublic) {
        this.isPublic = isPublic;
    }

    @Override
    public String toString() {
        return "SourceGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", type=" + type +
                ", rank=" + rank +
                ", mallId='" + mallId + '\'' +
                ", state=" + state +
                ", isDefault=" + isDefault +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                ", createBy='" + createBy + '\'' +
                ", updateBy='" + updateBy + '\'' +
                ", module=" + module +
                ", isPublic=" + isPublic +
                '}';
    }
}
