//package com.arc.util;
//
//import cn.com.besttone.csp.web.security.core.SecurityUserService;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.builders.WebSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.security.core.userdetails.UserDetailsService;
//
//@Configuration
//@EnableWebSecurity//1  注解开启Spring Security的功能
////@EnableGlobalMethodSecurity(prePostEnabled = true, securedEnabled = true, jsr250Enabled = true)
////使用@EnableGlobalMethodSecurity(prePostEnabled = true)
//// 这个注解，可以开启security的注解，我们可以在需要控制权限的方法上面使用@PreAuthorize，@PreFilter这些注解。
//public class WebSecurityConfig extends WebSecurityConfigurerAdapter {
//
//
////    @Autowired
////    private UserDetailsService userDetailsService;
//
//
//    @Bean
//    UserDetailsService customUserService() {
//        return new SecurityUserService();
//    }
//
//    @Bean
//    MySecurityMetadataSource  mySecurityMetadataSource() {
//        return new MySecurityMetadataSource();
//    }
//
//
//
//    @Override  // WebSecurity 跳过静态资源的认证
//    public void configure(WebSecurity web) throws Exception {
//        web.ignoring()
//                .antMatchers("/favicon.ico")
//                .antMatchers("/webjars/**")
//                .antMatchers("/resource/**")
//        ;
//    }
//
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.headers().frameOptions().sameOrigin();
//        http
//                .csrf().disable() //禁用CSRF保护
//                .authorizeRequests().antMatchers(//不拦截资源的url
//                "http://localhost/system/realm/query"
//                    ).permitAll()
//                .anyRequest().authenticated()//需要认证的
//                .and()
//                .formLogin().loginPage("/login").loginProcessingUrl("/login/form").defaultSuccessUrl("/index").failureUrl("/login/error").permitAll()  //表单登录，permitAll()表示这个不需要验证 登录页面，登录失败页面
//                .and()
//                .logout().logoutSuccessUrl("/login");// 退出默认跳转页面 (5)
//
//    }
//
//
//
//
//    @Override
//    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//        //auth
//        //    .inMemoryAuthentication()
//        //    .withUser("root")
//        //    .password("root")
//        //    .roles("ADMIN", "USER")
//
//        //    .and()
//        //    .withUser("admin").password("admin")
//        //    .roles("ADMIN", "USER")
//        //    .and()
//        //    .withUser("user").password("user")
//        //    .roles("USER");
//        //AuthenticationManager使用我们的 lightSwordUserDetailService 来获取用户信息
//        auth.userDetailsService(customUserService());
//    }
//
//
////    @Autowired//内存中创建了一个用户，该用户的名称为user，密码为 admin，用户角色为USER。
////    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////        auth
////                .inMemoryAuthentication()
////                .withUser("admin").password("admin").roles("USER");
////    }
//
//
////    @Override
////    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
////        auth.userDetailsService(customUserService());
////    }
//
////    configure(HttpSecurity http) 方法
////    通过 authorizeRequests() 定义哪些URL需要被保护、哪些不需要被保护。
//// 例如以上代码指定了 / 和 /home 不需要任何认证就可以访问，其他的路径都必须通过身份验证。
////    通过 formLogin() 定义当需要用户登录时候，转到的登录页面。
//
//}
