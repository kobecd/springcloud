package com.arc.mybatisplus.service;


import com.arc.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;

import java.util.List;

/**
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface UserService {

    boolean deleteAll();

    List<User> selectListBySQL();

    List<User> selectListByWrapper(Wrapper wrapper);


    /**
     * 分页查询用户表中的信息
     *
     * @return 注意默认分页大小
     */
//    List<User> page();


}
