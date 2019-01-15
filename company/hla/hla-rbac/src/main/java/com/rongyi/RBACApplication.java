package com.rongyi;


//import com.rongyi.context.config.annotations.EnableSwagger2Api;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//注意:
//@EnableSwagger2Api
@MapperScan("com.rongyi.mapper")
@RestController
@SpringBootApplication
public class RBACApplication {

    public static void main(String[] args) {
        SpringApplication.run(RBACApplication.class, args);
    }

    @RequestMapping("/info")
    public String hello() {
        return "HELLO";
    }


}
