package com.del.ssoserver.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {

    @RequestMapping("/hello")
    public String index(Model model) {
        model.addAttribute("username", "SSO-Server");
        return "hello";
    }
}
