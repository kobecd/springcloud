//package com.arc.security7.controller.page;
//
//import org.springframework.stereotype.Controller;
//import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//
///**
// * @author 叶超
// * @since: 2019/5/8 21:38
// */
//@Controller
//public class LoginController {
//
//    @RequestMapping(value = "/testLogin", method = {RequestMethod.GET, RequestMethod.POST})
//    public String testLogin() {
//        return "login2";
//    }
//
//    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
//    public String test(@PathVariable Long id) {
//        return "index";
//    }
//
//    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
//    public String index() {
//        return "index";
//    }
//
////    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
////    public String login() {
////        return "login";
////    }
//}
//
////测试
////1后端生成验证码，并记录签发给哪个用户（redis.set(userKeyInCookie,code) ），
////2从cookie中获取用户标记(cookie.get(key) to grt key)
////3 check code is right and is valid
////4response
