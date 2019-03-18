package com.arc.client.website.controller;

import com.arc.client.website.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private UserService userService;

    @GetMapping("/user/get")
    @ResponseBody
    public Object getUser() {
        return userService.get(1L);
    }

}
