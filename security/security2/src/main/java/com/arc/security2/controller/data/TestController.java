package com.arc.security2.controller.data;

import org.springframework.web.bind.annotation.*;

/**
 * @author 叶超
 * @since: 2019/5/7 22:03
 */
@RequestMapping(value = "/test")
@RestController
public class TestController {

    @GetMapping(value = "/{id}")
    public Object user(@PathVariable Long id) {
        return id;
    }

}
