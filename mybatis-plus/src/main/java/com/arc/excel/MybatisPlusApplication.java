package com.arc.excel;

import lombok.extern.slf4j.Slf4j;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

/**
 * mybatis-plus Spring Boot 测试 Demo
 * 文档：http://mp.baomidou.com
 *
 * @author yechao
 * * @date 2018/12/21
 */
@Slf4j
@EnableTransactionManagement
@MapperScan("com.arc.mybatisplus.mapper")
@SpringBootApplication
@RestController
public class MybatisPlusApplication {
    /**
     * <p>
     * 测试 RUN
     * 查看 h2 数据库控制台：http://localhost:8080/console
     * 使用：JDBC URL 设置 jdbc:h2:mem:testdb 用户名 sa 密码 sa 进入，可视化查看 user 表
     * 误删连接设置，开发机系统本地 ~/.h2.server.properties 文件
     * <p>
     * 1、http://localhost:8080/user/test
     * 2、http://localhost:8080/user/test1
     * 3、http://localhost:8080/user/test2
     * 4、http://localhost:8080/user/test3
     * 5、http://localhost:8080/user/add
     * 6、http://localhost:8080/user/selectsql
     * 7、分页 size 一页显示数量  current 当前页码
     * 方式一：http://localhost:8080/user/page?size=1&current=1
     * 方式二：http://localhost:8080/user/pagehelper?size=1&current=1
     * </p>
     */
    public static void main(String[] args) {
//        SpringApplication.run(MybatisPlusApplication.class, args);
        SpringApplication app = new SpringApplication(MybatisPlusApplication.class);
        app.setBannerMode(Banner.Mode.OFF);
        app.run(args);
        log.info("PortalApplication is success!");
        System.err.println("sample started. http://localhost:8080/user/test");
    }


    @RequestMapping("/info")
    public Object info() {
        return "info" + new Date();
    }
}

