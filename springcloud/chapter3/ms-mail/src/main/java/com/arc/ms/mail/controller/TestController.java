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
@RequestMapping("/mail")
public class TestController {


    @RequestMapping("/v1")
    public String t1(Long id) throws InterruptedException {
        long start = System.currentTimeMillis();

        log.debug("------------------------------");
        log.debug("send----测试 v1");
        log.debug("------------------------------");


        StringBuffer stringBuffer = new StringBuffer();
        long sl = (10 * 60) * 1000L;
        log.debug("休眠时间={}",sl);
        Thread.sleep(sl);
        log.debug("------------------------------");
        log.debug("结果={}ms", System.currentTimeMillis() - start);
        log.debug("------------------------------");


        stringBuffer.append("#服务端耗时").append(System.currentTimeMillis() - start).append(" ms, id=").append(id);
        log.debug("############################");
        log.info("数据={}", stringBuffer.toString());
        log.debug("############################");
        return stringBuffer.toString();
    }


    @RequestMapping("/v2")
    public String v2() {
        return "v2";
    }
}
