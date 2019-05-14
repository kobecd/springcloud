package com.arc.security6.controller.data.test;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @author 叶超
 * @since: 2019/5/9 23:05
 */
@Setter
@Getter
public class Code implements Serializable {

    private String code;

    public Code(String code) {
        this.code = code;
    }

    public Code() {
    }
}
