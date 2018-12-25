package com.antsoft.service;

import com.antsoft.mapper.UserMapper;
import com.antsoft.model.User;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Jason on 2017/3/2.
 */
@Service
public class UserService {
    @Autowired
    private UserMapper userMapper;

    public List<User> getAll(User user){
        if (user.getPage() != null && user.getRows() != null) {
            PageHelper.startPage(user.getPage(), user.getRows());
        }
        return userMapper.selectAll();
    }

}
