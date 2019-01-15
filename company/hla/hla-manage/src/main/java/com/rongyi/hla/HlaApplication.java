package com.rongyi.hla;

import com.rongyi.context.config.annotations.EnableSwagger2Api;
import com.rongyi.utils.JsonHelper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@MapperScan("com.rongyi.hla.mapper")
@EnableSwagger2Api
//@EnableAutoConfiguration(exclude = {
//        ReactiveAuthenticationManager.class
//})
@RestController
//@EnableScheduling//定时任务
@SpringBootApplication
public class HlaApplication {

    public static void main(String[] args) {
        SpringApplication.run(HlaApplication.class, args);
    }

    @RequestMapping("/info")
    public String hello() {
        return "HELLO";
    }


    @Bean
    public JsonHelper getJsonHelper() {
        return new JsonHelper();
    }
}
