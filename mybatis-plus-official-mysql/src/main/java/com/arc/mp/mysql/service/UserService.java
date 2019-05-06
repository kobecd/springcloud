package com.arc.mp.mysql.service;


import com.arc.mp.mysql.domain.sys.User;

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

}
