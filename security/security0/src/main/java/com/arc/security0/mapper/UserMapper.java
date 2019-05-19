package com.arc.security0.mapper;

import com.arc.security0.domain.sys.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Param;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends BaseMapper<User> {


    User getByUsername(@Param("username") String username);
}
