package com.arc.security3.mapper;


import com.arc.security3.domain.sys.SysUser;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends BaseMapper<SysUser> {


    SysUser getByUsername(@Param("username") String username);
}
