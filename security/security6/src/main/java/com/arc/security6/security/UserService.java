package com.arc.security6.security;

import org.springframework.security.core.userdetails.UserDetails;

/**
 * @author 叶超
 * @since 2019/5/15 9:02
 */
public interface UserService {
    UserDetails loadUserByUsername(String username);

}
