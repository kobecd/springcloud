package com.del.serverrabbitmq;

import com.del.serverrabbitmq.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class ServerRabbitmqApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerRabbitmqApplication.class, args);
    }

    @Autowired
    private UserService userService;

    @RequestMapping("send")
    public Object test(String str) {
        userService.send(str);
        return str;
    }
}
