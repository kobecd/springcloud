package com.rongyi.rbac.config;

import com.rongyi.rbac.security.core.*;
import com.rongyi.utils.MD5Encryption;
import com.rongyi.utils.MD5Utils;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.access.intercept.FilterSecurityInterceptor;
import org.springframework.web.cors.CorsUtils;

/**
 * Description：spring security  config
 * Author:  caijie
 * History: 变更记录
 * <ModifiedBy>    <ModifiedDate>     <ModifiedVersion>
 * Administrator          2018/8/16 19:27          1.0
 * ModifiedRemark:
 * Copyright (C): 上海容易网电子商务股份有限公司
 */

@Slf4j
@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

    private static final Logger logger = LoggerFactory.getLogger(WebSecurityConfig.class);

    @Autowired
    @Qualifier("securityUserService")
    private UserDetailsService userDetailsService; //如果userDetailService没有扫描到就加上面的@ComponentScan
    @Autowired
    private AuthenticationSuccessHandler authenticationSuccessHandler;
    @Autowired
    private AuthenticationFailureHandler authenticationFailureHandler;
    @Autowired
    private AuthenticationLogoutSuccessHandler authenticationLogoutSuccessHandler;


    @Override
    public void configure(WebSecurity web) throws Exception {
        web.ignoring()
                .antMatchers("/favicon.ico")
                .antMatchers("/webjars/**")
                .antMatchers("/resource/**")
                .antMatchers("/product/**")

                //sku spu group 相关接口--支持屏端用& 支持后台
                .antMatchers("/product/page/spu")
                .antMatchers("/product/page")
                .antMatchers("/product/rfid")
                .antMatchers("/product/spu/page")
                .antMatchers("/product/spu/update")
                .antMatchers("/product/spu/get")
                .antMatchers("/product/group/list")
                .antMatchers("/file/upload")
                .antMatchers("/file/addToGroup")
                .antMatchers("/test/**")
                .antMatchers("/forward/ops/**")
        ;
        super.configure(web);

    }

    @Autowired
    public void configureGlobalSecurity(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService);
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.headers().frameOptions().sameOrigin();
        //http.addHeaderWriter(new XFrameOptionsHeaderWriter(XFrameOptionsHeaderWriter.XFrameOptionsMode.SAMEORIGIN));
        http
                .csrf().disable()//禁用CSRF保护
                .authorizeRequests().antMatchers(
//                "/product/page/spu"
//                , "/product/page"
//                , "/product/rfid"
//                , "/product/spu/page"
//                , "/product/spu/update"
//                , "/product/group/list"
//                , "/file/upload"
//                , "/file/addToGroup"
//                , "/product/spu/get"
//                , "/test/getAccessToken"
//                , "/test**"
//                , "/test/**"
//                "/info"
        ).permitAll()

                //.antMatchers("/me").hasAnyRole("MEMBER","SUPER_ADMIN")//个人首页只允许拥有MENBER,SUPER_ADMIN角色的用户访问
                // .anyRequest().fullyAuthenticated()//任何访问都必须授权
                .antMatchers("/j_spring_security_check").permitAll()//允许访问的方法
                .requestMatchers(CorsUtils::isPreFlightRequest).permitAll() // 使其支持跨域
                .anyRequest().authenticated()//需要认证的
                .and()
                .formLogin()
                .loginPage("/login/loginPage").permitAll()//这里程序默认路径就是登陆页面，允许所有人进行登陆
                .loginProcessingUrl("/j_spring_security_check")//登陆提交的处理url ,请注意设置post方式需设置请求参数方式enctype =“multipart / form-data”
                .usernameParameter("username").passwordParameter("password")//登陆时，请求参数
                .successHandler(authenticationSuccessHandler) //登陆成功，处理，配置了successForwardUrl，此配置会失效
                .failureHandler(authenticationFailureHandler)  //指定登录失败跳转地址, 使用自定义错误信息
                /* .successForwardUrl("/login/ajaxLogin")//登陆成功的url，这里去获取用户信息,会出现类无法注入问题
                 .failureForwardUrl("/login/error")//登陆失败进行转发，这里回到登陆页面，参数error可以告知登陆状态*/
                .and()
                .rememberMe().tokenValiditySeconds(604800)//记住我功能，cookies有限期是一周
                .rememberMeParameter("rememberMe")//登陆时是否激活记住我功能的参数名字，在登陆页面有展示
                .rememberMeCookieName("JSESSIONID")//cookies的名字，登陆后可以通过浏览器查看cookies名字
                .and()
                .logout()
                //.logoutUrl("/logout").permitAll().logoutSuccessUrl("/?logout=true")//按顺序，第一个是登出的url，security会拦截这个url进行处理，所以登出不需要我们实现，第二个是登出url，logout告知登陆状态
                .logoutSuccessHandler(authenticationLogoutSuccessHandler)
                //.logoutRequestMatcher(new AntPathRequestMatcher("/logout")) //重写退出登陆地址url
                .deleteCookies("JSESSIONID").invalidateHttpSession(true) // 设置退出,invalidateHttpSession设置退出后无效session
                .and()
                .sessionManagement().invalidSessionUrl("/login/loginPage")
                .maximumSessions(2)//防止用户在多处同时登录
                .maxSessionsPreventsLogin(false) //session 并发，一个用户在线后其他的设备登录此用户失败，true、后来者登陆不上，false、后来者挤掉前者
                .expiredUrl("/login/loginPage");

        http.addFilterBefore(webFilterSecurityInterceptor(), FilterSecurityInterceptor.class);//增加权限过滤器

        //http.exceptionHandling().authenticationEntryPoint(new CustomAuthenticationEntryPoint())
        //.accessDeniedHandler(new CustomAccessDeineHandler());//添加自定义异常入口，处理accessdeine异常
    }

    //密码加密
    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(new PasswordEncoder() {
            @Override
            public String encode(CharSequence rawPassword) {
                return MD5Utils.encrypt16((String) rawPassword);
            }

            @Override
            public boolean matches(CharSequence rawPassword, String encodedPassword) {
                String decipheringPassword = null;
                try {
                    decipheringPassword = MD5Encryption.encrypt((String) rawPassword);
                } catch (Exception e) {
                    logger.debug("MD5  get error when  deciphering password  " + e.toString());
                }
                // 前台密码明文MD5
                String tem = MD5Utils.encrypt16(decipheringPassword);
                Boolean password = true;
                if (!encodedPassword.equals(tem)) {
                    password = false;
                    throw new UsernameNotFoundException("密码错误！");
                }
                return password;
            }
        });
    }


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

