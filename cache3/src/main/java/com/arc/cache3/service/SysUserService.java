package com.arc.cache3.service;


import com.arc.cache3.model.domain.SysUser;
import com.arc.cache3.model.request.SysUserRequest;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author 叶超
 * @since 2019/3/15 15:54
 */
public interface SysUserService {

    Long save(SysUser user);

    int delete(Long id);

    int update(SysUser user);

    SysUser get(Long id);

    List<Object> listPage(SysUserRequest query);
}
