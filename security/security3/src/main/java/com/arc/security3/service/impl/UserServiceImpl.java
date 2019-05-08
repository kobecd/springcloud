package com.arc.security3.service.impl;


import com.arc.security3.domain.sys.SysUser;
import com.arc.security3.mapper.UserMapper;
import com.arc.security3.service.UserService;
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
    public Long save(SysUser user) {
        return null;
    }

    @Override
    public int delete(Long id) {
        return 0;
    }

    @Override
    public int update(SysUser user) {
        return 0;
    }

    @Override
    public SysUser get(Long id) {
        return userMapper.selectById(id);
    }

    @Override
    public List<SysUser> list() {
        List<SysUser> userList = userMapper.selectList(null);
        return userList;
    }

    @Override
    public SysUser getByUsername(String username) {
        //https://www.jianshu.com/p/07be9ccb3306
        //https://blog.csdn.net/yuanlaijike/article/details/80249235
        return userMapper.getByUsername(username);
    }

    @Override
    public Boolean login(String username, String password) {
        return null;
    }


    /*

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
        List<User> users = sysUserMapper.list();
        System.out.println(users);
        return users;
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
*/


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
//    @Override
//    public boolean saveOrUpdateBatch(Collection<User> entityList) {
//        return super.saveOrUpdateBatch(entityList);
//    }


}
