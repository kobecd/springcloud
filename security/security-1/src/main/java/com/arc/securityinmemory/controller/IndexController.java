package com.arc.securityinmemory.controller;

import com.arc.securityinmemory.model.vo.ResponseVo;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

/**
 *   监控配置
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


    public static void main(String[] args) {
//        test();

        test2();



    }

    private static void test2() {
        ResponseVo<Object> vo = new ResponseVo<>();

        Optional<ResponseVo> optionalResponseVo = null;
        System.out.println(optionalResponseVo.isPresent());
        System.out.println(optionalResponseVo.isPresent());
        System.out.println(optionalResponseVo.isPresent());
    }

    private static void test() {

        //测试退出
        for (int i = 0; i < 1000; i++) {
            System.out.println(i);
            if (i == 50) {
                System.exit(0);
            }
        }

    }
}
