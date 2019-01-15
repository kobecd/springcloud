package com.rongyi.rbac.security.core;

import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Description：用户注销处理
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */
@Slf4j
@Service("authenticationLogoutSuccessHandler")
public class AuthenticationLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {

    @Override
    public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication) throws IOException, ServletException {

        log.info("用户注销");
        //super.handle(request, response, authentication);
        response.getWriter().println("{\"meta\": {\"errno\":0,\"msg\": \"logoutSuccess\"},\"result\": {\"data\": 0 }}");
        response.getWriter().flush();
    }
}
