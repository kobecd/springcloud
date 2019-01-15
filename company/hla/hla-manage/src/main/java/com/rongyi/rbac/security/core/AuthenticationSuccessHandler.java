package com.rongyi.rbac.security.core;


import com.alibaba.fastjson.JSONObject;
import com.rongyi.rbac.model.entity.UserInfo;
import com.rongyi.rbac.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;


/**
 * Description：登陆成功处理
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
@Slf4j
@Service("authenticationSuccessHandler")
public class AuthenticationSuccessHandler extends SimpleUrlAuthenticationSuccessHandler {


    @Autowired
    private UserService userService;

    @Override
    public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        log.info("------->login success!");
        UserDetails userDetails = (UserDetails) authentication.getPrincipal();
        String account = userDetails.getUsername();
        Collection<? extends GrantedAuthority> authorities = userDetails.getAuthorities();
        List<String> auths =  new ArrayList<>();
        UserInfo userInfo = new UserInfo();
        if(authorities.isEmpty()) {
            userInfo = userService.getUserByUserAccount(account);
            auths = userService.getAuthsValueByUserId(userInfo.getId());
        }
        log.info("------->userInfo "+ userInfo);
        //用户信息
        JSONObject user = new JSONObject();
        user.put("UserId", userInfo.getId());
        user.put("Username", account);
        user.put("Name",userInfo.getName());
        //登陆状态
        JSONObject landingState = new JSONObject();
        landingState.put("Enabled", userDetails.isEnabled()); //正常
        landingState.put("AccountNonExpired", userDetails.isAccountNonExpired());//帐户未过期
        landingState.put("credentialsNonExpired", userDetails.isCredentialsNonExpired());//凭据未过期
        landingState.put("AccountNonLocked", userDetails.isAccountNonLocked());//帐户未锁定

        JSONObject result = new JSONObject();
        result.put( "userInfo",user);
        result.put( "landingState",landingState);

        if(authorities.isEmpty()) {
            result.put("Authorities", auths);
        }else {
            result.put("Authorities", authorities);
        }

        //把用户数据保存在session域对象中
        HttpSession session = request.getSession();
        session.setAttribute("userInfo", result);
        //log.info("+++++++>Session" + request.getSession(true));
        //log.info("+++++++>Session" + request.getSession().getAttribute( "userInfo" ));

        response.setContentType("application/json;charset=UTF-8");
        response.getWriter().print("{\"meta\": {\"errno\":0,\"msg\": \"login success\"},\"result\": {\"data\": "+ result+" }}");
        response.getWriter().flush();

    }

}

