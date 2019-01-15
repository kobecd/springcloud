package com.rongyi.security;

import com.rongyi.entity.UserInfo;
import com.rongyi.utils.MD5Encryption;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.Collection;

/**
 * spring security 内部认的 用户 Spring Security中，
 * 用户信息保存在SecurityContextHolder中，
 * 在Controller中使用SecurityUser代替User
 *
 * @author dengqianyong@besttone.com.cn
 */
@Slf4j
public class SecurityUser implements UserDetails {

    /**
     *
     */
    private static final long serialVersionUID = -3398892872793452L;

    private UserInfo user;

    private Collection<GrantedAuthority> authorities;

    // 构造 SecurityUser
    private SecurityUser(UserInfo user) {
        super();
        this.user = user;

//        if (getRoles() == null) {
//
//            authorities = Collections.emptyList();
//        } else {
            //构造权限

//            this.authorities = new ArrayList<>(getRoles().size());
//            getRoles().forEach((role) -> {
//                this.authorities.add(new SimpleGrantedAuthority(role.getRoleName()));
//            });
//        }
    }

    public static SecurityUser build(UserInfo user) {
        return new SecurityUser(user);
    }

    public UserInfo getUser() {
        return user;
    }

    @Override
    public String getUsername() {
        return user.getUsername();
    }

    @Override
    public String getPassword() {
        return user.getPassword();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {// 授权信息
        return authorities;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        if(user.getStatus().intValue() == 1){
            return true;
        }else {
            return false;
        }
    }


    public void setAuthorities(Collection<GrantedAuthority> authorities) {
        this.authorities = authorities;
    }


    public SecurityUser() {
    }

    public void setUser(UserInfo user) {
        this.user = user;
    }
}
