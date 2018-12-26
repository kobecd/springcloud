package com.del.serverrabbitmq.service;

import com.arc.model.User;


public interface UserService {

    void send(User user);

    void send(String str);
}
