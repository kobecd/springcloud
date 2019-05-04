package com.arc.security3.service;


import com.arc.security3.domain.sys.User;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface UserService {

    Long save(User User);

    int delete(Long id);

    int update(User User);

    User get(Long id);

    List<User> list();

    User getByUsername(String username);

    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    Boolean login(String username, String password);

}
