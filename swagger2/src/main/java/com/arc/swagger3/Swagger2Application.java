package com.arc.swagger3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yechao
 * @date 2018/12/21
 */
@SpringBootApplication
@RestController
public class Swagger2Application {

    public static void main(String[] args) {
        SpringApplication.run(Swagger2Application.class, args);
    }


    @RequestMapping("/info")
    public Object info() {
        return "info" + new Date();
    }
}

