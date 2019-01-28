package com.arc.ws.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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


    @GetMapping(value = "/")
    public String test(@PathVariable Long id) {
        return "/test-index";
    }

    @GetMapping(value = "/v1")
    public String user() {
        return "test-ws";
    }


    @GetMapping(value = "/login")
    public String login() {
        return "/test-login";
    }


}
