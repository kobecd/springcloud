package com.arc.static1.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/**
 * @author: yechao
 * @date: 2019/1/2 23:24
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class IndexController {

    //    1当配置文件中未指明该key时候，可以注入冒号后面的这个缺省值；2配置文件中指定了key，但是value未空的情况下，空value会被注入，即该String的值未空串
    @Value("${test.key1:bbb}")
    private String key;

    @Value("${test.key2:true}")
    private Boolean aBoolean;

    @GetMapping(value = "/v0")
    public String test() {
        return "/test-index -----" + key;
    }

    @GetMapping(value = "/v1")
    public String user() {
        return "test---" + aBoolean;
    }


    @GetMapping(value = "/login")
    public String login() {
        return "/test-login";
    }


}
