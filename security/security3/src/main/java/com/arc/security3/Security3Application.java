package com.arc.security3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 安全框架 配置  SecurityConfig
 * 这一项目目的：
 * 1、使用密码加密解密的功能来完善安全框架
 *
 * 注意：
 * 全部安全框架都有 默认配置， 在yml配置中指定用户名，密码即可
 */
@MapperScan("com.arc.security3.mapper")
@SpringBootApplication
public class Security3Application {

    public static void main(String[] args) {
        SpringApplication.run(Security3Application.class, args);
    }

}

