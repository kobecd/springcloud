package com.arc.security5.model;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 叶超
 * @since: 2019/5/8 22:14
 */
@Setter
@Getter
public class ResponseSimple {

    private Object content;

    public ResponseSimple(String content) {
        this.content = content;
    }
}
