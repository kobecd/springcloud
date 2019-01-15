package com.rongyi.easy.smart.entity;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/16.
 */
public class SourceGroupRef implements Serializable{

    private Integer sourceId;
    private Integer groupId;

    public Integer getSourceId() {
        return sourceId;
    }

    public void setSourceId(Integer sourceId) {
        this.sourceId = sourceId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }
}
