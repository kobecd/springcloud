package com.arc.cache2.mapper;

import com.arc.cache2.model.domain.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 *
 * @author 叶超
 * @since 2019/3/15 15:54
 */
public interface SysUserMapper {

    int save(SysUser user);

    int delete(Long id);

    int update(SysUser user);

    SysUser get(Long id);

    /**
     * 根据用户名称获取用户信息
     *
     * @param identifier
     * @return
     */
    SysUser getByIdentifierAndIdentityType(@Param("identifier") String identifier, @Param("identityType") Integer identityType);

    List<SysUser> list();

}
