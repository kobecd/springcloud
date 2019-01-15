package com.rongyi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableScheduling//定时任务
@RestController
@MapperScan({"com.rongyi.hla.mapper", "com.rongyi.rbac.mapper"})
@SpringBootApplication
//public class HlaApplication extends SpringBootServletInitializer {
public class HlaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlaApplication.class, args);
    }


//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
//        return builder.sources(HlaApplication.class);
//    }




    @RequestMapping("/info")
    public String hello() {
        return "HELLO";
    }


}
