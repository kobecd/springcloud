package com.arc.security6.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author 叶超
 * @since: 2019/5/8 21:38
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/testLogin", method = {RequestMethod.GET, RequestMethod.POST})
    public String testLogin() {
        return "testLogin";
    }


    @RequestMapping(value = "/test.html", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
        return "sys/test";
    }


    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public String index1() {
        return "index";
    }
}
