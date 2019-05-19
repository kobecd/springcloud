package com.arc.security3.security;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author 叶超
 * @since 2019/4/29 18:04
 */
public class UserSecurity implements UserDetails {


    private String username;

    private String password;

    private Collection<GrantedAuthority> authorities;

    @Override
    public String getPassword() {
        return this.username;
    }

    @Override
    public String getUsername() {
        return this.password;
    }

    //帐户未过期 true=过期/false=未过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //是（密码）凭据未过期
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    //是帐户非锁定 是否锁定冻结
    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    //已启用 （用户是否被删除了）
    @Override
    public boolean isEnabled() {
        return false;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

}
