package com.arc.mail.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yechao
 * @date: 2018/11/15 19:14
 * @description:
 */
@Slf4j
@Controller
@RestController
@RequestMapping("/mail")
public class MailController {



    @RequestMapping("/1")
    public Object t1() {
        long start = System.currentTimeMillis();
        return System.currentTimeMillis() - start;
    }

    @RequestMapping("/2")
    public Object t2() {
        long start = System.currentTimeMillis();
        log.info("jpa 方式查询数据库耗时={} ms ", (System.currentTimeMillis() - start));
        return System.currentTimeMillis() - start;
    }

}
