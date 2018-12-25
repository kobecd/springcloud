package com.arc.mybatisplus.service;


import com.arc.mybatisplus.model.entries.User;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface UserService {

    Long save(User user);

    int delete(Long id);

    int update(User user);

    User get(Long id);

    List<User> list();

    /**
     * 分页查询用户表中的信息
     *
     * @return 注意默认分页大小
     */
    List<User> page();

    /**
     * 根据用户名称获取用户信息
     *
     * @param username
     * @return
     */
    User getByUserName(String username);

}
