package com.arc.security.memory;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 全部安全框架都有 默认配置， 在yml配置中指定用户名，密码即可
 */
@SpringBootApplication
public class SecurityInMemoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityInMemoryApplication.class, args);
    }

}

