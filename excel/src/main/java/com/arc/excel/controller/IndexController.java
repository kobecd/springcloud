package com.arc.excel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author: yechao
 * @date: 2019/1/2 23:24
 * @description:
 */
@Controller
public class IndexController {


    @GetMapping(value = "/index")
    public String user(@PathVariable Long id) {
        return "index";
    }
}