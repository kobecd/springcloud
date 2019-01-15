package com.rongyi.init;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;


@Component
public class SystemInitializationStartup implements ApplicationListener<ContextRefreshedEvent> {


    //配置在配置文件中
    //	@Value("${system.initial:false}")
    boolean initial = Boolean.TRUE;



    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        //Spring容器加载完毕之后执行: 以下方法
//        if (initial) {
//        }
        System.out.println("Spring容器加载完毕之后执行");
    }


}
