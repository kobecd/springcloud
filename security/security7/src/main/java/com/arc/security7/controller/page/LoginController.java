package com.arc.security6.controller.page;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
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
        return "login2";
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String test(@PathVariable Long id) {
        return "index";
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "index";
    }

//    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
//    public String login() {
//        return "login";
//    }
}
