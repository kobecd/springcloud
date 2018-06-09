package com.del.serverrabbitmq.service.impl;


import com.del.serverrabbitmq.service.UserService;
import model.User;
import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private AmqpTemplate template;


    @Override
    public void send(User user) {
        template.convertAndSend("queue_obj", user);
    }

    @Override
    public void send(String str) {
        template.convertAndSend("queue_string", str);
    }
}
