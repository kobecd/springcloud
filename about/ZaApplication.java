package com.arc.za;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
@SpringBootApplication
public class ZaApplication {

    public static void main(String[] args) {
        SpringApplication.run(ZaApplication.class, args);
    }


    @RequestMapping("/test")
    public Object test() {
        long startTimeMillis = System.currentTimeMillis();
        log.debug("记录访问时间={}", startTimeMillis);
        return startTimeMillis;
    }
}
