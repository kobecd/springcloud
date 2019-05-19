package com.arc.security2.config;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 认证授权的配置类
 *
 * @author 叶超
 * @since: 2019/5/7 22:03
 */
public class SecurityAdapterConfigurer extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.csrf().disable()
                //.formLogin()
                .httpBasic()
                .and()
                .authorizeRequests()
                .anyRequest()
                .authenticated();

    }

/*    // create two users, admin and user
    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("user").roles("USER")
                .and()
                .withUser("admin").password("admin").roles("ADMIN");
        auth.jdbcAuthentication();

//        auth.authenticationProvider(custAuthenticationProvider);

    }*/
}