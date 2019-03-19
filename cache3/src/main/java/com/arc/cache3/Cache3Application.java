package com.arc.cache3;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;


/**
 * @author 叶超
 * @since 2019/3/15 15:54
 */
// 缓存配置 在配置类上有效
@EnableCaching
@SpringBootApplication
@MapperScan("com.arc.cache3.mapper")
public class Cache3Application {

    public static void main(String[] args) {
        SpringApplication.run(Cache3Application.class, args);
    }
}
