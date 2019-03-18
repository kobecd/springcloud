package com.xuwx.myorigin.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by xuwx on 2018/11/16.
 */
@Controller
public class MyIndexController {

    @RequestMapping("/")
    public String myIndex(){
        return "myIndex";
    }
}
