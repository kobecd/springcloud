package com.arc.mybatisplus;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * @author yechao
 * @date 2018/12/21
 */
@MapperScan("com.arc.mybatisplus.mapper")
@SpringBootApplication
@RestController
public class MybatisApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisApplication.class, args);
    }


    @RequestMapping("/info")
    public Object info() {
        return "info" + new Date();
    }
}

