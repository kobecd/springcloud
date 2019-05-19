package com.arc.security4.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * 安全框架配置类
 *
 * @author 叶超
 * @since: 2019/5/7 22:41
 */
@Configuration
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    public static final String LOGIN = "/test/login";
    public static final String LOGIN_PROCESSING_URL = "/v1/login/form/process";

    /**
     * 用自己定义的页面登录系统完成认证
     * <p>
     * 说明下面注释中的*：
     * 【*1】 表示登录时候的登录页url，即，访问url返回login.html;我们需要写 一个controller的方法去返回一个页面 以及一个login的页面
     * 【*2】表示输入用户名密码点击登录时候，表单提交的处理地址url，是框架来处理的，我们之u要配置一下地址即可
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage(LOGIN)//*1
                .loginProcessingUrl(LOGIN_PROCESSING_URL)//*2
                .and()
                .authorizeRequests()
                .antMatchers(LOGIN).permitAll()
                .anyRequest()
                .authenticated()
                .and()
                .csrf()
                .disable();

    }

    //密码加密解密，是使用框架提供的加密解密方法
    @Bean(name = "passwordEncoder")
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

}
