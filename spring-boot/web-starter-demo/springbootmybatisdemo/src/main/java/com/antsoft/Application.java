package com.antsoft;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.embedded.AnnotationConfigEmbeddedWebApplicationContext;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.time.LocalDateTime;

/**
 * Created by Jason on 2017/3/1.
 */
@RestController
@EnableWebMvc
@SpringBootApplication
@MapperScan(basePackages = "com.antsoft.mapper")
public class Application {

    @RequestMapping("/")
    String index(){
        return "Hello,This is SpringBoot";
    }

    @RequestMapping("/now")
    String now(){
        return "现在时间是:"+LocalDateTime.now().toString();
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
