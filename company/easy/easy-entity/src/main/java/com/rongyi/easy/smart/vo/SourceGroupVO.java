package com.rongyi.easy.smart.vo;

import com.rongyi.easy.smart.entity.SourceGroup;

import java.io.Serializable;

/**
 * Created by yandong on 2017/10/18.
 */
public class SourceGroupVO extends SourceGroup implements Serializable{

    private Integer sourceNum;

    public Integer getSourceNum() {
        return sourceNum;
    }

    public void setSourceNum(Integer sourceNum) {
        this.sourceNum = sourceNum;
    }
}
