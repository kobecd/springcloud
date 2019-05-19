package com.arc.security5.controller.page;

import com.arc.security5.config.security.SecurityConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


/**
 * @author 叶超
 * @since: 2019/5/8 21:38
 */
@Controller
public class LoginController {

    @RequestMapping(value = "/arc_login.html", method = {RequestMethod.GET, RequestMethod.POST})
    public String testLogin() {
        return "arc_login";
    }


    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
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

    @GetMapping(value = "/info/{id}")
    @ResponseBody
    public Object user(@PathVariable Long id) {
        return id;
    }
}
