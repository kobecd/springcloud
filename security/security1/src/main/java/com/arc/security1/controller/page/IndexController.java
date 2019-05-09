package com.arc.security1.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

/**
 * 返回页面的录用控制器
 */
@Controller
public class IndexController {

    @GetMapping(value = "/{id}")
    public String user(@PathVariable Long id) {
        return "index";
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String test(@PathVariable Long id) {
        return "index";
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login() {
        return "login";
    }

}