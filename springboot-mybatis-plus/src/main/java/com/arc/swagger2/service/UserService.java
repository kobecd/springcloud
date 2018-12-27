package com.arc.swagger2.service;

import com.arc.swagger2.entity.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * User 表数据服务层接口
 * JAVA项目是分层来写的，
 * 这是服务层，目的是处理业务，
 *
 * @author yechao
 * @date 2018/12/21
 */
public interface UserService extends IService<User> {

    boolean deleteAll();

    public List<User> selectListBySQL();

    public List<User> selectListByWrapper(Wrapper wrapper);
}
