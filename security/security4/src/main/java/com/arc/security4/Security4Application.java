package com.arc.security4;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 全部安全框架都有 默认配置， 在yml配置中指定用户名，密码即可
 */
@SpringBootApplication
public class Security4Application {

    public static void main(String[] args) {
        SpringApplication.run(Security4Application.class, args);
    }

}

