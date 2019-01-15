package com.arc.excel.listener;

import com.sun.deploy.util.SystemUtils;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/15 17:02
 */
public class LogbackListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent event) {
        ServletContext sc = event.getServletContext();
        System.out.println(System.currentTimeMillis()+"   contextInitialized "+sc);


//        //添加系统属性示例代码
//        if (org.apache.commons.lang3.SystemUtils.IS_OS_WINDOWS) {
//            System.setProperty("log.path", "${CATALINA_HOME}" + SystemUtils.FILE_SEPARATOR + "logs");
//        } else {//linux
//            System.setProperty("log.path", "/logs");
//        }
//
//        if (isProductEnv) {
//            System.setProperty("log.root.level", "INFO");
//        } else {//非生产环境
//            System.setProperty("log.root.level", "DEBUG");
//        }
//
//
//        WebLogbackConfigurer.initLogging(sc);
    }

    @Override
    public void contextDestroyed(ServletContextEvent event){
        System.out.println(System.currentTimeMillis()+"   contextDestroyed");
//        WebLogbackConfigurer.shutdownLogging(event.getServletContext());
    }
}

//作者：曲高和寡_健
//        链接：https://www.jianshu.com/p/39178af66aef
//        來源：简书
