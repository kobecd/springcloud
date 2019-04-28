package com.arc.security.db.service;


import com.arc.security.db.model.domain.sys.SysUser;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface UserService {

    Long save(SysUser SysUser);

    int delete(Long id);

    int update(SysUser SysUser);

    SysUser get(Long id);

    List<SysUser> list();

    SysUser getByUsername(String username);

    /**
     * 登陆
     *
     * @param username
     * @param password
     * @return
     */
    Boolean login(String username, String password);

}
