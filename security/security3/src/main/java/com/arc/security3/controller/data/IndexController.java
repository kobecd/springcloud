package com.arc.security3.controller.data;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

/**
 * @author: yechao
 * @date: 2019/1/2 23:24
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class IndexController {


    @GetMapping(value = "/{id}")
    public Object user(@PathVariable Long id) {
        log.debug("参数id={}", id);
        return id;
    }

    @RequestMapping(value = "/", method = {RequestMethod.GET, RequestMethod.POST})
    public String test() {
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
