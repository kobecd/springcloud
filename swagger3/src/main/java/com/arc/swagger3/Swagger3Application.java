package com.arc.swagger3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Date;

/**
 * @author yechao
 * @date 2018/12/21
 */
@EnableSwagger2
@SpringBootApplication
@RestController
public class Swagger3Application {

    public static void main(String[] args) {
        SpringApplication.run(Swagger3Application.class, args);
    }


    @RequestMapping("/info")
    public Object info() {
        return "info" + new Date();
    }
}

