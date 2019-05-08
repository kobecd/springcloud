package com.arc.security1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * //https://blog.csdn.net/liushangzaibeijing/article/details/81220610
 * security.basic.enabled 配置过时或不可用
 * 简单粗暴方法：
 * 把 Security包从pom.xml中移出去
 * 科学一点的：
 * 在Application启动类上（或者任意@Configure配置类上）增加如下注解：
 * 每次启动后在控制台中会生成一个密码，账号为“user”
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

