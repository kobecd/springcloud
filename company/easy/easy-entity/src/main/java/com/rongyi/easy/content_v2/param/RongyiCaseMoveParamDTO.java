package com.rongyi.easy.content_v2.param;

import org.apache.commons.lang.builder.ToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;

import java.io.Serializable;

/**
 * @author: yb
 * Description:
 * DATE: 2017/12/20 18:44
 * Package:com.rongyi.easy.content_v2.param
 * Project:easy-common
 */
public class RongyiCaseMoveParamDTO implements Serializable {
    private static final long serialVersionUID = -2327445631624852557L;
    private static final int MOVE_UP = 0;
    private static final int MOVE_DOWN = 1;


    private Integer id;
    // 0上移；1：下移
    private Integer type;
    private Integer operateUser;


    public Integer getOperateUser() {
        return operateUser;
    }

    public void setOperateUser(Integer operateUser) {
        this.operateUser = operateUser;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.DEFAULT_STYLE);
    }
}
