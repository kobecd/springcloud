package com.antsoft.controller;

import com.antsoft.model.User;
import com.antsoft.service.UserService;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by Jason on 2017/3/2.
 */
@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserService userService;

    @RequestMapping(value = "/all")
    public PageInfo<User> getALL(User user){
        List<User> userList = userService.getAll(user);
        return new PageInfo<>(userList);
    }
}
