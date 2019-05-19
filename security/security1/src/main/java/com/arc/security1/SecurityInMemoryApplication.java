package com.arc.security1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 安全框架 初学:使用的是全默认配置
 * 这一项目目的：
 * 1、体验spring security
 * 2、security.basic.enabled 配置是否启用，
 * 2.1、过时或不可用的解决方案（简单粗暴方法）：https://blog.csdn.net/liushangzaibeijing/article/details/81220610
 * 把 Security包从pom.xml中移出去
 * 2.2、排除自动配置（科学一点的）：
 * 在Application启动类上（或者任意@Configure配置类上）增加如下注解：
 * 注意：每次启动后在控制台中会生成一个密码，账号为“user”
 * Using generated security password: b815bb0b-32fe-4100-b02f-1161a469b023
 */
@SpringBootApplication(
//        exclude = {
//                org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration.class
//        }
)
public class SecurityInMemoryApplication {

    public static void main(String[] args) {
        SpringApplication.run(SecurityInMemoryApplication.class, args);
    }

}

