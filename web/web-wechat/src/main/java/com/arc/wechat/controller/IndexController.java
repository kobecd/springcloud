package com.arc.wechat.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import java.util.Date;

@RequestMapping("/test")
@Controller
@Slf4j//注解在类上；为类提供一个 属性名为log 的 log4j 日志对象
public class IndexController {


    //上传图片
    @GetMapping(value = "/index")
    public String upload(MultipartFile file, Model model) {
        model.addAttribute("mark", "传递参数MARK 时间： " + new Date());
        return "index";
    }
    }




