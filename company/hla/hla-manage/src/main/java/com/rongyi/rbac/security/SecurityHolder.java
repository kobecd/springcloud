package com.rongyi.rbac.security;

import com.rongyi.rbac.model.entity.User;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;

/**
 * Description：获取安全信息的工具类
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/21 14:14          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 * 从ecurityContextHolder中获取
 */

public final class SecurityHolder {

    /**
     * @Author： caijie
     * @Description： 得到当前登录用户
     * @Date： 2018/8/21 14:14
     * @Param： []
     * @Return： com.rongyi.entity.User
     */
    public static User loginUser() {
        return (User) SecurityContextHolder.getContext()
                .getAuthentication().getPrincipal();
    }

    /**
     * 得到当前登录用户的凭证信息
     *
     * @return
     */
    public static Authentication getAuthentication() {
        return SecurityContextHolder.getContext()
                .getAuthentication();
    }

    Object principal = SecurityContextHolder.getContext().getAuthentication().getPrincipal();

    //获取登陆主体的username
    public static String getUsername(User principal) {//spring security 的登陆主体对象
        String username = null;
        if (principal instanceof UserDetails) {
            username = ((UserDetails) principal).getUsername();
        } else {
            username = principal.toString();
        }
        return username;
    }

}
