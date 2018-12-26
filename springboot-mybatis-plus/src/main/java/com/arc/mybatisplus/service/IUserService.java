package com.arc.mybatisplus.service;

import com.arc.mybatisplus.entity.User;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * User 表数据服务层接口
 */
public interface IUserService extends IService<User> {

    boolean deleteAll();

    public List<User> selectListBySQL();

    public List<User> selectListByWrapper(Wrapper wrapper);
}
