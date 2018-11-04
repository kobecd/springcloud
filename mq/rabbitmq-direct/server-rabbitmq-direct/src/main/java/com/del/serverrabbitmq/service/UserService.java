package com.del.serverrabbitmq.service;


import model.User;

public interface UserService {

    void send(User user);

    void send(String str);
}
