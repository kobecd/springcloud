package com.arc.mybatis.service.impl;

import com.arc.mybatis.mapper.UserMapper;
import com.arc.mybatis.service.UserService;
import com.arc.mybatis.model.entries.SysUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserMapper userMapper;



    @Override

    public Long save(SysUser user) {
        return userMapper.save(user) == 1 ? user.getId() : null;
    }

    @Override
    public int delete(Long id) {
        return userMapper.delete(id);
    }

    @Override
    @Transactional
    public int update(SysUser user) {
        return userMapper.update(user);
    }

    @Override
    public SysUser get(Long id) {
        return userMapper.get(id);
    }

    @Override
    public SysUser getByFilePath(String username) {
        return userMapper.getByUsername(username);
    }

    @Override
    public List<SysUser> list() {
        return userMapper.list();
    }

}
