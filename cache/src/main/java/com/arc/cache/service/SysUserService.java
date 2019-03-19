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

    SysUser testCacheKeyMethodName(SysUser user, Long id, String name);
    SysUser testCacheKeyMethodName2(SysUser user, Long id, String name);
    SysUser testCacheKeyTarget(SysUser user, Long id, String name);

    SysUser testCacheKeyTargetClass(SysUser user, Long id, String name);
    SysUser testCacheKeyArgs(SysUser user, Long id, String name);
    SysUser testCacheKeyArgsName(SysUser user, Long id, String name) ;

    //condition属性指定发生的条件
    SysUser testCondition(SysUser user);


    List<SysUser> list();


    /**
     * 特殊方法
     *      * 根据用户名称获取用户信息
     * t_sys_user_auth left join  t_sys_user
     *
     * @param identifier 身份标记
     * @param identityType  登录类型
     * @return SysUSer with auth
     */
    SysUser getByIdentifierAndIdentityType(String identifier, Integer identityType);

    /**
     * 测试用 登陆
     *
     * @param username
     * @param password
     * @return
     */
    Boolean login(String username, String password);

    List<Object> listPage(SysUserRequest query);
}
