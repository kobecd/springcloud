//package com.rongyi.hla.web;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.stereotype.Controller;
//import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RequestMethod;
//import org.springframework.web.bind.annotation.RequestParam;
//
///**
// * Login控制器
// *
// * @author: yechao
// * @date: 2018/08/07 15:27
// * @version: V1.0
// */
//@Slf4j
//@Controller
//public class LoginController {
//
//
//    @RequestMapping(value = "/error", method = RequestMethod.GET)
//    public String error() {
//        return "redirect:/login";
//    }
//
//    @RequestMapping(value = "/login", method = RequestMethod.GET)
//    public String login(Model model, @RequestParam(value = "error", required = false) String error) {
//        if (error != null) {
//            model.addAttribute("error", "用户名或密码错误");
//        }
//        log.debug("#######################");
//        //        return "/login.html";
//        return "product/product.html";
//    }
//}
