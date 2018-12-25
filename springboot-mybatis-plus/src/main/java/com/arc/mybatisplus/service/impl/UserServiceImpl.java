package com.arc.mybatisplus.service.impl;


import com.arc.mybatisplus.mapper.FileMapper;
import com.arc.mybatisplus.model.entries.User;
import com.arc.mybatisplus.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private FileMapper mapper;

    @Override
    public Long save(User user) {
        mapper.save(user);
        return user.getId();
    }

    @Override
    public User get(Long id) {
        return mapper.get(id);
    }

    @Override
    public User getByFilePath(String filePath) {
        return mapper.getByFilePath(filePath);
    }

    @Override
    public User getByUrl(String url) {
        return mapper.getByUrl(url);
    }

    @Override
    public List<User> list() {
        List<User> list = mapper.list();
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        System.out.println(list.size());
        return list;
    }

    @Override
    public int delete(Long id) {
        return mapper.delete(id);
    }

    @Override
    public int update(User user) {
        return mapper.update(user);
    }

    @Override
    public User getByFilename(String filename) {
        return mapper.getByFilename(filename);
    }

    @Override
    public User getLatest() {
        return mapper.getLatest();
    }
}