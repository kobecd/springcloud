package com.arc.security3.security;

import com.arc.security3.domain.sys.User;
import com.arc.security3.service.RoleService;
import com.arc.security3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collection;

/**
 * @author 叶超
 * @since 2019/4/29 17:53
 */
@Service("userDetailsService")
//@Service("testUserDetailsService")
public class TestUserDetailsService implements UserDetailsService {

    @Autowired
    private UserService userService;

    @Autowired
    private RoleService roleService;


    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Collection<GrantedAuthority> authorities = new ArrayList<>();
        // 从数据库中取出用户信息
        User user = userService.getByUsername(username);

        // 判断用户是否存在
        if (user == null) {
            throw new UsernameNotFoundException("用户名不存在");
        }

        // 添加权限
//        List<Role> userRoles = userRoleService.listByUserId(user.getId());
//        for (UserRole userRole : userRoles) {
//            Role role = roleService.selectById(userRole.getRoleId());
//            authorities.add(new SimpleGrantedAuthority(role.getName()));
//        }

        // 返回UserDetails实现类
        return new UserSecurity(user, authorities);
    }
}
