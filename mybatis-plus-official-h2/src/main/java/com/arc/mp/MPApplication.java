package com.arc.mp;

import com.arc.mp.mapper.UserMapper;
import com.arc.mp.model.domain.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@MapperScan("com.arc.mp.mapper")
@SpringBootApplication
@RestController
public class MPApplication {

    public static void main(String[] args) {
        SpringApplication.run(MPApplication.class, args);
    }

    @RequestMapping("/")
    public Object test() {
        return System.currentTimeMillis();
    }


    @Resource
    private UserMapper userMapper;

   @RequestMapping("/list")
    public Object testList() {
       List<User> userList = userMapper.selectList(null);
       return userList;
    }

}

