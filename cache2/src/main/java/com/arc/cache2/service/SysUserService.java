package com.arc.cache2.service;


import com.arc.cache2.model.domain.SysUser;
import com.arc.cache2.model.request.SysUserRequest;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author 叶超
 * @since 2019/3/15 15:54
 */
public interface SysUserService {

    Long save(SysUser SysUser);

    int delete(Long id);

    int update(SysUser SysUser);

    SysUser get(Long id);

    SysUser testCacheKey1(SysUser user, Long id, String name);
    SysUser testCacheKey2(SysUser user, Long id, String name);
    SysUser testCacheKey3(SysUser user, Long id, String name);

    List<Object> listPage(SysUserRequest query);
}
