package com.arc.security6.security.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.AuthorityUtils;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Component;

import java.util.Collection;

/**
 * @author 叶超
 * @since: 2019/5/7 22:52
 */
@Component
public class SecuritySysUserService implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(SecuritySysUserService.class);

//    @Autowired
//    private UserService userService;

    @Autowired
    private PasswordEncoder passwordEncoder;

    /**
     * 获取数据库中定义的用户
     * 组装Spring Security的 User
     *
     * @param username
     * @return
     * @throws UsernameNotFoundException
     */
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug("登陆的用户名是username={}", username);
        //查询数据库获取用户，判断密码是否正确

        Collection<? extends GrantedAuthority> authorities = AuthorityUtils.commaSeparatedStringToAuthorityList("admin");
        //前两个参数是做认证--> 第三个参吧字符串转换为 权限数组
//        User user = new User(username, "admin", true, false, false,false,authorities);


        //todo 这里写死的账号密码，这个密码应该书创建用户的时候创建的
        String pwd = passwordEncoder.encode("admin");
        log.debug("加密后的pwd={}", pwd);

        User user = new User(username, pwd, authorities);
        log.debug("登陆的用户是 user={}", user);
        return user;
    }
}

//java.lang.IllegalArgumentException: There is no PasswordEncoder mapped for the id "null"
//有自动变化的盐
// 登陆的 pwd=$2a$10$m9viwi6WjpiO4Rvb42uHNeiUs4cE5JijdpGCICXpbZ75CUOQDW5oy
//登陆的 pwd=$2a$10$aJVMTAcn.9aALHfFPnmjNOdmmf6v1JbjR8yIpDdS7flcygEFtxbSy
