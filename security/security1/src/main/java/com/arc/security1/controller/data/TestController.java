package com.arc.security1.controller.data;

import org.springframework.web.bind.annotation.*;

@RequestMapping(value = "/test")
@RestController
public class TestController {

    @GetMapping(value = "/{id}")
    public Object user(@PathVariable Long id) {
        return id;
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String test(@PathVariable Long id) {
        return "index";
    }

    @RequestMapping(value = "/index", method = {RequestMethod.GET, RequestMethod.POST})
    public String index() {
        return "index";
    }

    @RequestMapping(value = "/login", method = {RequestMethod.GET, RequestMethod.POST})
    public String login() {
        return "login";
    }

}
