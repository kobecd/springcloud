package com.arc.security6.filter;

import com.arc.security6.config.StaticFied;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.filter.OncePerRequestFilter;

import javax.annotation.Resource;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 图形验证码过滤器
 *
 * @author 叶超
 * @since 2019/5/9 23:42
 */
@Slf4j
public class VolidateImageCodeFilter extends OncePerRequestFilter {

    @Resource
    private RedisTemplate<Object, Object> redisTemplate;


    @Override
    protected void doFilterInternal(HttpServletRequest request, HttpServletResponse response, FilterChain filterChain) throws ServletException, IOException {
        String loginUrl = StaticFied.loginUrl;
        if (loginUrl.equals(request.getRequestURI()) && RequestMethod.POST.toString().equals(request.getMethod().toUpperCase())) {
            Cookie[] cookies = request.getCookies();

            boolean isAuthCode = verifyImageCode(request);
        }
        //否则
        filterChain.doFilter(request, response);

    }

    private boolean verifyImageCode(HttpServletRequest request) {
        Cookie[] cookies = request.getCookies();
        String keyForRedisInCookie = null;
        if (cookies != null) {
            for (Cookie cookie : cookies) {
                if (StaticFied.KEY_FOR_COOKIE.equalsIgnoreCase(cookie.getName())) {
                    keyForRedisInCookie = cookie.getValue();
                    break;
                }
            }
        }
        if (keyForRedisInCookie != null) {
            String valueFromRedis = (String) redisTemplate.opsForValue().get(keyForRedisInCookie);

            String identifyingCode = (String) request.getAttribute("verifyCode");
            log.debug("redis验证码={},用户传入参数中的验证码={}", valueFromRedis,identifyingCode);
            log.debug("redis验证码={},用户传入参数中的验证码={}", valueFromRedis,identifyingCode);
            log.debug("redis验证码={},用户传入参数中的验证码={}", valueFromRedis,identifyingCode);
            log.debug("redis验证码={},用户传入参数中的验证码={}", valueFromRedis,identifyingCode);
            return identifyingCode == null ? false : identifyingCode.equalsIgnoreCase(valueFromRedis);
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        boolean post = RequestMethod.POST.toString().equals("POST");//true
        System.out.println(post);
    }
}
