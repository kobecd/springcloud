package com.rongyi.config;

import com.rongyi.security.core.WebAccessDecisionManager;
import com.rongyi.security.core.WebFilterInvocationSecurityMetadataSource;
import com.rongyi.security.core.WebFilterSecurityInterceptor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);

    @Autowired
    @Qualifier("securityUserService")
    private UserDetailsService userDetailsService;

    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/favicon.ico")
                .antMatchers("/webjars/**")
                .antMatchers("/resource/**")
        ;
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().sameOrigin();
        http
                .csrf().disable() //禁用CSRF保护
                //不拦截资源的url
                .authorizeRequests().antMatchers("/login", "http://www.baidu.com").permitAll()
                .anyRequest().authenticated()//需要认证的
                .and()
                .formLogin().defaultSuccessUrl("/a").permitAll()

//            .formLogin().loginPage("/login").loginProcessingUrl("/login/form").defaultSuccessUrl("/").permitAll()
//            .formLogin().loginPage("/login").loginProcessingUrl("/login/form").defaultSuccessUrl("http://www.baidu.com").permitAll()
                .and()
                .rememberMe()
                .and()
                .logout().permitAll(); //注销行为任意访问

        http.addFilterBefore(webFilterSecurityInterceptor(), FilterSecurityInterceptor.class);

    }

    //密码加密
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        auth.userDetailsService(userDetailsService).passwordEncoder(new PasswordEncoder() {
//            @Override
//            public String encode(CharSequence rawPassword) {
//                return MD5Utils.encrypt16((String) rawPassword);
//            }
//
//            @Override
//            public boolean matches(CharSequence rawPassword, String encodedPassword) {
//                String decipheringPassword = null;
//                try {
//                    decipheringPassword = AESEncryptUtil.desEncrypt((String) rawPassword);
//                } catch (Exception e) {
//                    logger.debug("AES  get error when  deciphering password  "+e.toString());
//                }
//                // 前台密码明文MD5
//                String tem = MD5Utils.encrypt16((String) decipheringPassword);
//
//                return encodedPassword.equals(tem);
//            }
//        });
//    }


    //授权决策器
    @Bean
    public WebAccessDecisionManager webAccessDecisionManager() {
        return new WebAccessDecisionManager();
    }


    //调用服务去查出所有资源信息
    @Bean
    public WebFilterInvocationSecurityMetadataSource webFilterInvocationSecurityMetadataSource() {
        return new WebFilterInvocationSecurityMetadataSource();
    }

    //权限过滤器
    @Bean
    public WebFilterSecurityInterceptor webFilterSecurityInterceptor() {
        return new WebFilterSecurityInterceptor();
    }
}

