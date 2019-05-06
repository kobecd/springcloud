package com.arc.security3.config;//package com.arc.security.db.config;
//
//import com.baomidou.mybatisplus.extension.plugins.PaginationInterceptor;
//import com.baomidou.mybatisplus.extension.plugins.PerformanceInterceptor;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//
///**
// * @author 叶超
// * @since: 2019/4/28 22:21
// */
//@Configuration
//public class MybatisPlusConfig {
//    @Bean
//    public PaginationInterceptor paginationInterceptor() {
//        PaginationInterceptor paginationInterceptor = new PaginationInterceptor();
//        paginationInterceptor.setDialectType("mysql");
//        paginationInterceptor.setOverflow(true);
//        return paginationInterceptor;
//    }
//
//    @Bean
//    public PerformanceInterceptor performanceInterceptor() {
//        PerformanceInterceptor performanceInterceptor = new PerformanceInterceptor();
//        performanceInterceptor.setFormat(true);	//SQL是否格式化 默认false
//        return performanceInterceptor;
//    }
//}
