//package com.arc.security6.config;
//
//import lombok.extern.slf4j.Slf4j;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
//import org.springframework.security.crypto.password.PasswordEncoder;
//
///**
// * @author 叶超
// * @since: 2019/5/7 22:31
// */
//@Configuration
//@Slf4j
//public class SecurityConfig extends WebSecurityConfigurerAdapter {
//
//    /**
//     * 用自己定义的页面*1 来向服务器的一个自定义的url *2 登录
//     * 是否需要身份认证
//     * 是否是HTML引发的请求？返回HTML，还是JSON
//     *
//     * @param http
//     * @throws Exception
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http
//                .formLogin()
//                .loginPage("/testLogin")//*1
//                .loginProcessingUrl("/login/form")//*2
//                .and()
//                .authorizeRequests()
//                .antMatchers("/testLogin", "/login/form", "/verify/code",  "/redis/**").permitAll()
//                .anyRequest()
//                .authenticated()
//                .and()
//                .csrf()
//                .disable();
//
//    }
//
//    //密码加密解密
//    @Bean(name = "passwordEncoder")
//    public PasswordEncoder passwordEncoder() {
//        return new BCryptPasswordEncoder();
//    }
//
//}
