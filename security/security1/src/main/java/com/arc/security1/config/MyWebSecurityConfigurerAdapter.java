//package com.arc.security.securityinmemory.config;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//
///**
// * @description:
// * @author: yechao
// * @date: 2019/1/9 23:10
// */
//public class MyWebSecurityConfigurerAdapter extends WebSecurityConfigurerAdapter {
//
////    @Autowired
////    private AccessDeniedHandler accessDeniedHandler;
//
//    // roles admin allow to access /admin/**
//    // roles user allow to access /user/**
//    // custom 403 access denied handler
//    //重写了其中的configure（）方法设置了不同url的不同访问权限
//    @Override
//    protected void configure(HttpSecurity http) throws Exception {
//        http.csrf().disable()
//                .authorizeRequests()
//                .antMatchers("/home", "/about", "/img/*").permitAll()
//                .antMatchers("/admin/**", "/upload/**").hasAnyRole("ADMIN")
//                .antMatchers("/order/**").hasAnyRole("USER", "ADMIN")
//                .antMatchers("/room/**").hasAnyRole("USER", "ADMIN")
//                .anyRequest().authenticated()
//                .and()
//                .formLogin()
//                .loginPage("/login")
//                .permitAll()
//                .and()
//                .logout()
//                .permitAll()
//                .and();
////                .exceptionHandling().accessDeniedHandler(accessDeniedHandler);
//    }
//
//    // create two users, admin and user
//    @Autowired
//    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
////
//        auth.inMemoryAuthentication()
//                .withUser("user").password("user").roles("USER")
//                .and()
//                .withUser("admin").password("admin").roles("ADMIN");
////
//        auth.jdbcAuthentication();
//
////        auth.authenticationProvider(custAuthenticationProvider);
//
//    }
//}
