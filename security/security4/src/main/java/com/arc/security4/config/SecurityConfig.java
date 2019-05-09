package com.arc.security4.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author 叶超
 * @since: 2019/5/7 22:41
 */
@Configuration
@Slf4j
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    /**
     * 用自己定义的页面登录系统完成认证
     *
     * @param http
     * @throws Exception
     */
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin()
                .loginPage("/testLogin")//*1
                .loginProcessingUrl("/login/form/v1")//*2
                .and()
                .authorizeRequests()
                .antMatchers("/testLogin").permitAll()
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
