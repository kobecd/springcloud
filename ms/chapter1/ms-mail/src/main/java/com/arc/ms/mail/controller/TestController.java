package com.arc.ms.mail.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author: yechao
 * @date: 2018/11/15 19:14
 * @description:
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class TestController {


    @RequestMapping("/v1")
    public String t1(Long id) throws InterruptedException {
        long start = System.currentTimeMillis();
        StringBuffer stringBuffer = new StringBuffer();
        Thread.sleep(1000L);

        stringBuffer.append("#服务端耗时").append(System.currentTimeMillis() - start).append(" ms, id=").append(id);
        log.debug("############################");
        log.info("数据={}",stringBuffer.toString());
        log.debug("############################");
        return stringBuffer.toString();
    }
}
