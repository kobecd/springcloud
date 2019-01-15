package com.rongyi.easy.smart.entity;

import java.util.Date;

/**
 * Created by yandong on 2017/12/21.
 */
public class BaseEntity {

    private String updateBy;
    private String createBy;
    private Date createAt;
    private Date updateAt;

    public String getUpdateBy() {
        return updateBy;
    }

    public void setUpdateBy(String updateBy) {
        this.updateBy = updateBy;
    }

    public String getCreateBy() {
        return createBy;
    }

    public void setCreateBy(String createBy) {
        this.createBy = createBy;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Date getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Date updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        return "BaseENtity{" +
                "updateBy='" + updateBy + '\'' +
                ", createBy='" + createBy + '\'' +
                ", createAt=" + createAt +
                ", updateAt=" + updateAt +
                '}';
    }
}
