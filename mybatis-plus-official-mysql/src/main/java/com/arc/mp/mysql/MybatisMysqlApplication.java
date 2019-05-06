package com.arc.mp.mysql;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * 全部安全框架都有 默认配置， 在yml配置中指定用户名，密码即可
 */
@MapperScan("com.arc.mp.mysql.mapper")
@SpringBootApplication
public class MybatisMysqlApplication {

    public static void main(String[] args) {
        SpringApplication.run(MybatisMysqlApplication.class, args);
    }

}

