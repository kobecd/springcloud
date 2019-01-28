package com.arc.excel.mapper;


import com.arc.excel.model.entries.sys.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是持久层，目的是与数据库交互，
 */
public interface UserMapper {

    int save(SysUser user);

    int delete(Long id);

    int update(SysUser user);

    SysUser get(Long id);

    SysUser getByUsername(@Param("username") String username);

    List<SysUser> list();

}
