public  class  SSController{


//https://www.jianshu.com/p/d94bb118aa43
//    原文：https://blog.csdn.net/u013783079/article/details/75307785






新建类SecurityConfiguration继承WebSecurityConfigurerAdapter 配置认证管理器，以及安全策略

①配置认证管理器（AuthenticationManagerBuilder）
2. 通过实现userDetailsService接口类重写loadUserByUsername()方法返回UserDetails进行密码匹配

auth.userDetailsService(customUserDetailsService).passwordEncoder(passwordEncoder());

auth.eraseCredentials(false);

该密码加密方式为Springsecurity推荐的加密方式，放弃之前的PasswordEncoder改用BCryptPasswordEncoder()

②配置安全策略（HttpSecurity）

http

//关闭csrf

//.csrf().disable()

//取消安全报文头 默认开启  可配置部分开启或全关

//.headers().disable()

//登录页面url 配置登录成功后调用的方法

.formLogin().loginPage("/login").permitAll().successHandler(loginSuccessHandler())

.and().csrf().csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse()).and()

.authorizeRequests()

//配置这些链接无需验证

.antMatchers("/regist","/toregist").permitAll()

//除以上路径都需要验证

.anyRequest().authenticated()

//路径角色验证

//.antMatchers("/admin/**").hasRole("ADMIN")

//排除该路径角色认证  注意顺序自上而下

//.antMatchers("/**").hasRole("USER")

.and()

//注销登录  默认支持 销毁session并且清空配置的rememberMe()认证 跳转登录页 或配置的注销成功页面

.logout()

.deleteCookies("remove")

.invalidateHttpSession(false)

.logoutUrl("/logout")

.logoutSuccessUrl("/logoutsuccess")

.and()

//http参数中包含一个名为“remember-me”的参数，不管session是否过期，用户记录将会被记保存下来

.rememberMe()

//.and()

////http映射https

//.portMapper()

//.http(8080).mapsTo(9443)

.and()

//配置http认证

.httpBasic()

.and()

//当用户进行重复登录时  强制销毁前一个登录用户  配置此应用必须添加Listener  HttpSessionEventPublisher

.sessionManagement()

            .maximumSessions(1)

            .expiredUrl("/login?expired");

 

 

三：编写SecurityUser类继承当前User类并且实现UserDetails接口

在构造方法中塞入需要返回给客户端的权限信息

 

四：编写CustomUserDetailsService类实现UserDetailsService接口

实现loadUserByUsername()方法将传入的用户名进行数据查询，并返回经过SecurityUser包装的UserDetails对象

 

五：根据需要新建LoginSuccessHandler类继承SavedRequestAwareAuthenticationSuccessHandler

重写onAuthenticationSuccess()方法，通过安全策略配置登录成功后调用该类，用作记录登录时间等日志信息


 


}
