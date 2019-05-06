package com.arc.mp.mysql.security;

import com.arc.mp.mysql.domain.sys.User;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * @author 叶超
 * @since 2019/4/29 18:04
 */
public class UserSecurity implements UserDetails {

    private User user;

    private Collection<GrantedAuthority> authorities;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.authorities;
    }

    @Override
    public String getPassword() {
        return this.user.getPassword();
    }

    @Override
    public String getUsername() {
        return this.user.getUsername();
    }

    //帐户未过期
    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    //是帐户非锁定
    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    //是凭据未过期
    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    //已启用
    @Override
    public boolean isEnabled() {
        return true;
    }


    public UserSecurity(User user, Collection<GrantedAuthority> authorities) {
        this.user = user;
        this.authorities = authorities;

    }
}
