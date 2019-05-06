package com.arc.mp.mysql.mapper;


import com.arc.mp.mysql.domain.sys.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;

import java.util.List;

/**
 * User 表数据库控制层接口
 */
public interface UserMapper extends BaseMapper<User> {


    int update(User user);

}
