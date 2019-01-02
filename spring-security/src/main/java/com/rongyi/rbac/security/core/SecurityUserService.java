package com.rongyi.rbac.security.core;


import com.rongyi.rbac.model.constants.Constant;
import com.rongyi.rbac.model.entity.UserInfo;
import com.rongyi.rbac.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

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

        if (username.trim().equalsIgnoreCase( "" )) {
            throw new BadCredentialsException( "账号不能为空！" );
        }

        UserInfo user = null;
        UserInfo userInfo = null;
        Boolean enabled = true; //用户已经被激活
        Boolean accountNonExpired = true; //过期未状态
        Boolean credentialsNonExpired = true; //凭证未过期
        Boolean accountNonLocked = true; //账号未锁定

        try {
            user = userService.getUserByUserAccount( username );
            log.info("loadUserByUsername.userInfor" +  user);
        } catch (Exception e) {
            e.printStackTrace();
            log.error( e.getMessage() );
        }

        if (user == null || user.getId() == null) {
            log.warn("Account does not exist");
            throw new BadCredentialsException( "账号不存在！" );
        }
        if (Constant.Status.STATUS_NORMAL.equals( user.getStatus() )) {
            userInfo = user;
        }else{
            if (user.getStatus().intValue() == 2) {
                log.warn( "Account is not activated!" );
                enabled = false;
                //throw new UsernameNotFoundException( "账号未激活！" );
                throw new BadCredentialsException( "账号被停用！" );
            }

            if (user.getStatus().intValue() == 3) {
                log.warn( "Account not found exception!" );
                credentialsNonExpired = false;
                throw new BadCredentialsException( "凭证过期！" );
            }

            if (user.getStatus().intValue() == 4) {
                log.warn( "Account has been locked!" );
                accountNonLocked = false;
                throw new BadCredentialsException( "账号已被锁定！" );
            }
        }

        List<GrantedAuthority> grantedAuths = new ArrayList<GrantedAuthority>(); //用户权限

        // 返回认证用户
        return new User( userInfo.getUsername(), userInfo.getPassword(), enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, grantedAuths );

    }

}
