package com.arc.security3.security;

import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 叶超
 * @since: 2019/5/7 22:52
 */
@Component
public class SecuritySysUserService implements UserDetailsService {

    private static final Logger log = LoggerFactory.getLogger(SecuritySysUserService.class);


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        log.debug("登陆的用户名是username={}", username);
        //查询数据库获取用户，判断密码是否正确
        Collection<? extends GrantedAuthority> authorities = new ArrayList<>();
        //前两个参数是做认证--> 第三个参吧字符串转换为 权限数组
        //todo 这里写死的账号密码
        //    public User(String username, String password, boolean enabled, boolean accountNonExpired, boolean credentialsNonExpired, boolean accountNonLocked, Collection<? extends GrantedAuthority> authorities) {
        User user = new User(username, "admin", true, false, false,false,authorities);

        return user;
    }
}
