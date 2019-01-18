package com.arc.cache.model.query;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

/**
 * @author: yechao
 * @date: 2018/11/11 16:09
 * @description:
 */
@Setter
@Getter
@ToString
public class PullLogQuery  implements Serializable {

    private Integer id;// 日志主键
    private Boolean success;// 状态码成功与否
    private String name;// 操作名称
    private String operator;// 操作者名称

    public PullLogQuery() {
    }

    public PullLogQuery(String name) {
        this.name = name;
    }
}
