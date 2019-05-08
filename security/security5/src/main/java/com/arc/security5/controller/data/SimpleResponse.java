package com.arc.security5.controller.data;

import lombok.Getter;
import lombok.Setter;

/**
 * @author 叶超
 * @since: 2019/5/8 22:14
 */
@Setter
@Getter
public class SimpleResponse {

    private Object content;

    public SimpleResponse(String content) {
        this.content = content;
    }
}
