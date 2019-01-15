package com.rongyi.rbac.security.core;

import com.rongyi.rbac.model.constants.Constant;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.WebAttributes;
import org.springframework.security.web.authentication.SimpleUrlAuthenticationFailureHandler;
import org.springframework.stereotype.Service;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


/**
 * Description：登陆失败处理
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Slf4j
@Service("authenticationFailureHandler")
public class AuthenticationFailureHandler extends SimpleUrlAuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException exception) throws IOException, ServletException {
        //response.sendError(HttpServletResponse.SC_UNAUTHORIZED, "Authentication failed");
        this.returnJson(response, exception);
    }

    /**
     * 直接返回需要返回的 json 数据
     */
    private void returnJson(HttpServletResponse response, AuthenticationException exception) throws IOException {
        //统一处理失败问题
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Access-Control-Allow-Origin", "*");
        response.setContentType("application/json");
        response.getWriter().println("{\"meta\": {\"errno\": \"" + Constant.ErrorCode.LOGIN
                + "\",\"msg\": \" "+ exception.getLocalizedMessage() + "\"},\"result\": {\"data\": 0 }}");
        response.getWriter().flush();
    }


    /**
     * 直接返会错误页面
     */
    private void returnErrorPage(HttpServletRequest request, HttpServletResponse response,
                                 AuthenticationException exception) throws IOException, ServletException {
        String strUrl = request.getContextPath() + "/loginErrorPath";
        request.getSession().setAttribute("status", 0);
        request.getSession().setAttribute("message", exception.getLocalizedMessage());
        request.getSession().setAttribute(WebAttributes.AUTHENTICATION_EXCEPTION, exception);
        // 使用该方法会出现错误
       //request.getRequestDispatcher(strUrl).forward(request, response);
        response.sendRedirect(strUrl);
    }
}