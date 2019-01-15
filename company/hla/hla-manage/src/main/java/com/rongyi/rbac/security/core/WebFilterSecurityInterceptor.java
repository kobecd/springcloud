package com.rongyi.rbac.security.core;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.SecurityMetadataSource;
import org.springframework.security.access.intercept.AbstractSecurityInterceptor;
import org.springframework.security.access.intercept.InterceptorStatusToken;
import org.springframework.security.web.FilterInvocation;

import javax.servlet.*;
import java.io.IOException;

/**
 * Description：权限过滤器
 * Author:  Administrator
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/21 14:13          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

//@Service
public class WebFilterSecurityInterceptor extends AbstractSecurityInterceptor implements Filter {


    @Autowired
    private WebFilterInvocationSecurityMetadataSource securityMetadataSource;

    @Autowired
    public void setMyAccessDecisionManager(WebAccessDecisionManager accessDecisionManager) {
        super.setAccessDecisionManager(accessDecisionManager);
    }

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
        FilterInvocation fi = new FilterInvocation(request, response, chain);
        invoke(fi);
    }

    public void invoke(FilterInvocation fi) throws IOException, ServletException {
        //里面调用MyInvocationSecurityMetadataSource 的getAttributes(Object object)这个方法获取fi对应的所有权限
        //再调用MyAccessDecisionManager的decide方法来校验用户的权限是否足够
        InterceptorStatusToken token = super.beforeInvocation(fi);
        try {
            //执行下一个拦截器
            fi.getChain().doFilter(fi.getRequest(), fi.getResponse());
        } finally {
            super.afterInvocation(token, null);
        }
    }

    @Override
    public void destroy() {
    }

    @Override
    public Class<?> getSecureObjectClass() {
        return FilterInvocation.class;
    }

    @Override
    public SecurityMetadataSource obtainSecurityMetadataSource() {
        return this.securityMetadataSource;
    }
}
