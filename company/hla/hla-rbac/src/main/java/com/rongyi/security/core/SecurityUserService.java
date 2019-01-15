package com.rongyi.security.core;


import com.rongyi.entity.UserInfo;
import com.rongyi.security.SecurityUser;
import com.rongyi.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;

/**
 * 从数据库中获取用户信息
 * 实现一个方法：loadUserByUsername
 * 作用 即从数据库中取出用户名、密码以及权限相关的信息。最后返回一个UserDetails 实现类
 */
@Slf4j
@Service("securityUserService")
public class SecurityUserService implements UserDetailsService {
    

    @Autowired
    private UserService userService;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug(" username "+username+" try login at" + new Date());
        UserInfo user = userService.getByUsername(username);//查数据库获得user
        log.info( "loadUserByUsername get userInfo" + user);
        if (user == null) {
            throw new UsernameNotFoundException("User [ " + username + " ] not found. ");
        }
        
        ArrayList<GrantedAuthority> authsList = new ArrayList<>();

       /* if (user.getRoles().size() > 0) {
           for (Role role : user.getRoles()) {
                if (EnableDisable.DISABLE.equals(  role.getState())) {//如果这个角色禁用了
                    role = null;
                    continue;
                }
                if (EnableDisable.ENABLE.equals(role.getRootAdmin())) {//如果是管理员
                    authsList.add(new SimpleGrantedAuthority(role.getRoleName()));//1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。
                    break;
                }
                    log.debug("用户认证的角色名称  "+ role.getRoleName());
                   authsList.add(new SimpleGrantedAuthority(role.getRoleName()));//1：此处将权限信息添加到 GrantedAuthority 对象中，在后面进行全权限验证时会使用GrantedAuthority 对象。

            }
        }*/

        log.debug("所有的角色" + authsList.toString());

        SecurityUser securityUser = new SecurityUser();
        securityUser.setUser(user);
        securityUser.setAuthorities(authsList);
        log.debug("Found user [{}]. ", securityUser);
        return securityUser;
//        return SecurityUser.build(user);
    }
}
