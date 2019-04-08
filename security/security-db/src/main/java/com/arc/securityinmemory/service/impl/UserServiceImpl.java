package com.arc.securityinmemory.service.impl;

import com.arc.securityinmemory.model.domain.sys.SysUser;

import com.arc.securityinmemory.mapper.SysUserMapper;
import com.arc.securityinmemory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
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
    private SysUserMapper sysUserMapper;


    @Override

    public Long save(SysUser user) {
        return sysUserMapper.save(user) == 1 ? user.getId() : null;
    }

    @Override
    public int delete(Long id) {
        return sysUserMapper.delete(id);
    }

    @Override
    public int update(SysUser user) {
//        return sysUserMapper.update(user);
        Integer update = sysUserMapper.update(user);
        System.out.println("#############################");
        System.out.println(update);
        System.out.println(update);
        System.out.println(update);
        System.out.println(update);
        System.out.println(update);
        System.out.println("#############################");
        return update;
    }


    @Override
    public SysUser get(Long id) {
        return sysUserMapper.get(id);
    }


    @Override
    public List<SysUser> list() {
        return sysUserMapper.list();
    }

    @Override
    public SysUser getByUsername(String username) {
        return sysUserMapper.getByUsername(username);
    }

    @Override
    public Boolean login(String username, String password) {
        Boolean result = false;
        SysUser dbUser = getByUsername(username);
        //@todo MD5或者其他加密手段
//        if (dbUser != null && dbUser.getPassword() != null && dbUser.getPassword().equals(password)) {
        result = true;
//        }
        return result;
    }

}
