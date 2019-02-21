package com.arc.blog.controller.test;

import org.springframework.util.Assert;

/**
 * @author: 叶超
 * @since: 2019/2/11 9:54
 */
public class TestAsert {

    public static void main(String[] args) {

        String str = null;
        Assert.isNull(str, "非空");
        str = "";
        Assert.isNull(str, "应该未空，但是事实上并不是null");
    }
}
