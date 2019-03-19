package com.arc.cache3.model.request;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author 叶超
 * @since 2019/3/15 15:54
 */
@Setter
@Getter
@ToString
public class SysUserRequest implements Serializable {

    private Integer id;// 日志主键
    private Boolean success;// 状态码成功与否
    private String name;// 操作名称
    private String operator;// 操作者名称

    public SysUserRequest() {
    }

    public SysUserRequest(String name) {
        this.name = name;
    }
}
