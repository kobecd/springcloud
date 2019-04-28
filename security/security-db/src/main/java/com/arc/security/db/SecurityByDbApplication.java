package com.arc.security.db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.arc.security.db.mapper")
@SpringBootApplication
@RestController
public class SecurityByDbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityByDbApplication.class, args);
    }

    @RequestMapping("/")
    public Object test() {

        return System.currentTimeMillis();
    }
}

