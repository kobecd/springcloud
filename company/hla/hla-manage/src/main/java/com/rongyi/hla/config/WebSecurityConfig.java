//package com.rongyi.hla.config;
//
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//import org.springframework.beans.factory.annotation.Value;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * 安全框架配置类
// * 为了改变其默认行为，我们可以提供一个子类覆盖WebSecurityConfigurerAdapter的默认行为
// *
// * @author: yechao
// * @date: 2018/08/07 15:27
// * @version: V1.0
// */
//@Configuration
//@EnableWebSecurity
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//    private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);
//
//
//    @Value("${spring.security.user.name}")
//    private String username;
//
//    @Value("${spring.security.user.password}")
//    private String password;
//
//    @Value("${server.servlet.context-path}")
//    private String serverServletContextPath;
//
//    /**
//     * 配置部分资源忽略安全校验（不拦截）
//     *
//     * @param web
//     * @throws Exception
//     */
//    @Override
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring()
//                .antMatchers("/resource/**")
//                .antMatchers("/favicon.ico")
//                .antMatchers("/webjars/**")
//                .antMatchers("/v2/**")
//                .antMatchers("/swagger-resources/**")
//        ;
//    }
//
//    /**
//     * 安全校验机制的配置
//     *
//     * @param http
//     * @throws Exception
//     */
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        logger.debug(username);
//        logger.debug(password);
//        logger.debug(serverServletContextPath);
//        http.headers().frameOptions().sameOrigin();
//        http
//                //不拦截资源的url
////                .authorizeRequests().antMatchers( serverServletContextPath+"/login",  serverServletContextPath+"/swagger-ui.html/**").permitAll()
////                .authorizeRequests().antMatchers(serverServletContextPath + "/login").permitAll()
//                .authorizeRequests().antMatchers(serverServletContextPath + "/**").permitAll()
//                .anyRequest().authenticated()//需要认证的
//                .and()
//                .formLogin()
//                .and()
//                .rememberMe()
//                .and()
//                .logout().permitAll() //注销行为任意访问
//                .and()
//                .csrf()
//                .disable() //禁用CSRF保护
//                .httpBasic();
//    }
//
//
//}
//
