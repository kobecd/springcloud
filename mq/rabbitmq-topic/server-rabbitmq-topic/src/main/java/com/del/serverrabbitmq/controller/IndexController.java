package com.del.serverrabbitmq.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {

    @RequestMapping("/pdf")
    public String test() {
        System.out.println("PDFFFFFFFFFFFFFFFFF");
        return "hello"  ;

    }}
