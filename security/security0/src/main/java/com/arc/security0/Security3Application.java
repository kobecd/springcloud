package com.arc.security0;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 全部安全框架都有 默认配置， 在yml配置中指定用户名，密码即可
 */
@MapperScan("com.arc.security0.mapper")
@SpringBootApplication
public class Security3Application {

    public static void main(String[] args) {
        SpringApplication.run(Security3Application.class, args);
    }

}

