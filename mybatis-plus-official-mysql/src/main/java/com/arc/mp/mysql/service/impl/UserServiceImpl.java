package com.arc.mp.mysql.service.impl;


import com.arc.mp.mysql.domain.sys.User;
import com.arc.mp.mysql.mapper.UserMapper;
import com.arc.mp.mysql.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper userMapper;

    @Override
    public Long save(User user) {
        return userMapper.insert(user)==1? user.getId():null;
    }

    @Override
    public int delete(Long id) {
        return userMapper.deleteById(id);
    }


    @Override
    public User get(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<User> list() {
        List<User> userList = userMapper.selectList(null);
        return userList;
    }


    @Override
    public int update(User user) {
        Integer update = userMapper.update(user);
        return update;
    }






//    /**
//     * 测试分页
//     * @return
//     */
//    public PageInfo<User> pageList(){
//        PageHelper.startPage(1, 2);
//        List<User> selectList = userMapper.selectList(new QueryWrapper<User>());
//        PageInfo<User> pageInfo = new PageInfo<User>(selectList);
//        return pageInfo;
//    }
//

}
