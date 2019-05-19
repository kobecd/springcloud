package com.arc.security2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/**
 * 安全框架 人工配置：com.arc.security2.config.SecurityAdapterConfigurer
 * 这一项目目的：
 * 1、用自己定义的页面登录系统完成认证
 *
 * @author 叶超
 * @since: 2019/5/7 22:03
 */
@SpringBootApplication
public class Security2Application {

    public static void main(String[] args) {
        SpringApplication.run(Security2Application.class, args);
    }

}
