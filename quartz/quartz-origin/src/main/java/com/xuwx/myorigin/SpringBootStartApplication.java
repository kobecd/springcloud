package com.xuwx.myorigin;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

/**
 * 使用 外部tomcat 打war 启动项目 需要增加 该启动类 继承springBootServletInitializer  并且重写configure方法
 * Created by xuwx on 2018/12/4.
 */
public class SpringBootStartApplication  extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(MyoriginApplication.class);
    }
}
