package com.del.serverrabbitmq;

import com.del.serverrabbitmq.service.UserService;
import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class ServerTopicRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerTopicRabbitmqApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @RequestMapping("send")
    public Object send() {
        User user = new User();
        user.setId("" + new Date().getTime());
        user.setUsername("" + new Date().getTime());
        user.setPassword("pass" + new Date().getTime());
        user.setNickName("测试对象" + new Date());
        user.setEmail("33333@qq.com");
        user.setCardNumber(3333345L);
        userService.send(user);
        return user;
    }

    @GetMapping("test")
    public Object test(String str) {
        userService.send(str);
        return str;
    }



}
