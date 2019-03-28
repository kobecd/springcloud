package com.arc.blog.two;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.arc.blog.two.mapper")
@SpringBootApplication
public class TwoServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(TwoServerApplication.class, args);
    }

}

