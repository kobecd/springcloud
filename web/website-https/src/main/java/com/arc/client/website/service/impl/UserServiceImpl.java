package com.arc.client.website.service.impl;

import com.arc.client.website.model.User;
import com.arc.client.website.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Override
    public User get(Long id) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int save(User user) {
        return 0;
    }

    @Override
    public int update(User user) {
        return 0;
    }

    @Override
    public List<User> list() {
        return null;
    }
}
