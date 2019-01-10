package com.arc.securityinmemory.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

/**
 * druid 监控配置
 */
@Controller
public class IndexController {


    @RequestMapping("/index")
    public String index(Model model) {
        System.out.println("#######");
        return "index";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/")
    @ResponseBody
    Map<String, String> home() {
        Map<String, String> map = new HashMap<>();
        map.put("say", "Hello World!");
        return map;
    }

    @RequestMapping("/users")
    public String users() {
        return "users";
    }
}
