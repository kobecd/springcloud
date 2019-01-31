package com.arc.async.controller;

import com.arc.async.service.PlanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @description:
 * @author: yechao
 * @date: 2019/1/25 14:23
 */
@Slf4j
@RestController
@RequestMapping("/test")
public class PlanController {

    @Resource
    private PlanService planService;

    @GetMapping("/v1")
    public Object v1() {
        log.debug("测试");
        return planService.sandMail(1L);
    }

    @GetMapping("/v2")
    public Object v2() {
        long start = System.currentTimeMillis();
        log.debug("------------------------------");
        log.debug("send----测试2");
        log.debug("------------------------------");
        planService.voidSandMailV2(22L);
        return System.currentTimeMillis() - start;
    }


    @GetMapping("/v3")
    public Object v3() throws ExecutionException, InterruptedException {
        long start = System.currentTimeMillis();
        log.debug("测试3");
        Future future = planService.sandMailV3(3L);
        System.out.println(future.isCancelled());
        System.out.println(future.isDone());
        System.out.println(future.get());
        return System.currentTimeMillis() - start;
    }


    //总结：
    // asynchronous是异步调用， 异步调用不关注返回，通常是void方法， 调用者与异步方法提供者不在同一个类中

    //1、在启动或者配置类上添加注解@EnableAsync
    //2、异步方法使用注解@Async ,返回值为void或者Future
    //3、 切记一点 ,异步方法和调用方法一定要写在不同的类中,如果写在一个类中,
    //是没有效果的


}
