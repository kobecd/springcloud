package com.arc.security5.config;

import com.arc.security5.config.properties.ArcSecurityProperties;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * SecurityConfig
 *
 * @author 叶超
 * @since: 2019/5/7 22:31
 */
@Configuration
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    private ArcSecurityProperties arcSecurityProperties;

    /**
     * 是否需要身份认证的请求发起时，如果没有登录的话
     * 哪些请求是需要返回登录页
     * 哪些请求需要返回JSON
     * -------------------
     * 用自己定义的页面*1 来向服务器的一个自定义的url *2 登录
     * <p>
     * 是否是HTML引发的请求？返回HTML，否则还是JSON
     * 注意：Login success后 跳转指定页面，缺省情况下是跳转"/"
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/auth/require")//*1
                .loginProcessingUrl("/login/form/v1")//*2
                .and()
                .authorizeRequests()
                .antMatchers("/auth/require", "/login/form/v1", arcSecurityProperties.getBrowserProperties().getLoginUrl()).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf()
                .disable();

    }

    //密码加密解密
    @Bean(name = "passwordEncoder")
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }
}
