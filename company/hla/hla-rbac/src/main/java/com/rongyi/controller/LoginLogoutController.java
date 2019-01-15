package com.rongyi.controller;

import com.rongyi.security.SecurityHolder;
import com.rongyi.security.SecurityUser;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by yechao on 2018/03/26.
 */
@Controller
public class LoginLogoutController {


//    @RequestMapping(value = "/login", method = {RequestMethod.POST, RequestMethod.GET})
//    public String login() {
//        System.out.println("1111");
//        return "/product/login.html";
//    }

    /**
     * 登陆提交数据处理器
     *
     * @return
     */
    @RequestMapping(value = "/login/form", method = RequestMethod.POST)
    public String doLogin() {
        return "/index";
    }

//    @RequestMapping(value = "/login/error", method = RequestMethod.GET)
//    public String loginError() {
//        return "/login-error";
//    }



  @RequestMapping(value = "/a")
    public String a() {
        return "redirect:http://z.cn";
    }


    @RequestMapping(value = "/test")
    public String test(Model model, String trackId) {
        SecurityUser securityUser = SecurityHolder.loginUser();
        model.addAttribute("user", securityUser);
        model.addAttribute("username", securityUser.getUsername());
        return "/test";

    }

}
