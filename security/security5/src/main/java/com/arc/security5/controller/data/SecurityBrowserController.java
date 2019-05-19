package com.arc.security5.controller.data;

import com.arc.security5.config.properties.ArcSecurityProperties;
import com.arc.security5.model.ResponseSimple;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.security.web.DefaultRedirectStrategy;
import org.springframework.security.web.RedirectStrategy;
import org.springframework.security.web.savedrequest.HttpSessionRequestCache;
import org.springframework.security.web.savedrequest.RequestCache;
import org.springframework.security.web.savedrequest.SavedRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.thymeleaf.util.StringUtils;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @author 叶超
 * @since: 2019/5/8 22:05
 */
@Slf4j
@RestController
public class SecurityBrowserController {

    @Autowired
    private ArcSecurityProperties arcSecurityProperties;

    private RequestCache cacheRequest = new HttpSessionRequestCache();

    private RedirectStrategy redirectStrategy = new DefaultRedirectStrategy();

    /**
     * 需身份认证时候，跳转到这里
     */
    @GetMapping(value = "/auth/require")
    @ResponseStatus(code= HttpStatus.UNAUTHORIZED)
    public Object get(HttpServletRequest request, HttpServletResponse response) throws IOException {
        SavedRequest savedRequest = cacheRequest.getRequest(request, response);
        //引发跳转的请求
        if (savedRequest != null) {
            String redirectUrl = savedRequest.getRedirectUrl();
            log.debug("引发跳转的URL={}", redirectUrl);
            if (StringUtils.endsWith(redirectUrl, "html")) {
                redirectStrategy.sendRedirect(request, response,arcSecurityProperties.getBrowserProperties().getLoginUrl());
            }
        }
        return  new ResponseSimple("需要登录");
    }
}
