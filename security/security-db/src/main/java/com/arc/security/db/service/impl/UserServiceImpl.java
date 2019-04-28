package com.arc.security.db.service.impl;

import com.arc.security.db.model.domain.sys.User;

import com.arc.security.db.mapper.UserMapper;
import com.arc.security.db.service.UserService;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author: yechao
 * @date: 2018/12/26 11:31
 * @description:
 */
@Transactional
@Service
public class UserServiceImpl implements UserService {

    @Resource
    private UserMapper sysUserMapper;


    @Override

    public Long save(User user) {
        return sysUserMapper.save(user) == 1 ? user.getId() : null;
    }

    @Override
    public int delete(Long id) {
        return sysUserMapper.delete(id);
    }

    @Override
    public int update(User user) {
//        return sysUserMapper.update(user);
        Integer update = sysUserMapper.update(user);
        System.out.println(("#############################"));
        System.out.println(update);
        System.out.println(("#############################"));
        return update;
    }


    @Override
    public User get(Long id) {
        return sysUserMapper.get(id);
    }


    @Override
    public List<User> list() {
        Wrapper<User> wapper = null;
        return sysUserMapper.selectList(wapper);
    }

    @Override
    public User getByUsername(String username) {
        return sysUserMapper.getByUsername(username);
    }

    @Override
    public Boolean login(String username, String password) {
        Boolean result = false;
        User dbUser = getByUsername(username);
        //@todo MD5或者其他加密手段
//        if (dbUser != null && dbUser.getPassword() != null && dbUser.getPassword().equals(password)) {
        result = true;
//        }
        return result;
    }

}
