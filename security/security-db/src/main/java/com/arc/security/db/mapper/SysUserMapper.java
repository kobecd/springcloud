package com.arc.security.db.mapper;


import com.arc.security.db.model.domain.sys.SysUser;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/22 11:18
 */
public interface SysUserMapper {

    int save(SysUser user);

    int delete(Long id);

    int update(SysUser user);

    SysUser get(Long id);

    SysUser getByUsername(@Param("username") String username);

    List<SysUser> list();
}
