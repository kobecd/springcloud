package com.arc.security8;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 安全框架 配置  SecurityConfig
 * 目的： 未登陆授权的请求来后台的时候，后端 返回HTML，否则还是JSON
 */
@SpringBootApplication
public class Security6Application {

    public static void main(String[] args) {
        SpringApplication.run(Security6Application.class, args);
    }

}

