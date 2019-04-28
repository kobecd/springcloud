//package com.arc.mp.config.aop;
//
//import lombok.extern.slf4j.Slf4j;
//import org.aspectj.lang.ProceedingJoinPoint;
//import org.aspectj.lang.annotation.Around;
//import org.aspectj.lang.annotation.Aspect;
//import org.aspectj.lang.annotation.Pointcut;
//import org.springframework.stereotype.Component;
//
///**
// * @author 叶超
// * @since 2019/4/15 17:31
// */
//@Slf4j
//@Component
//@Aspect
//public class AspicForController {
//
//    //    @Pointcut("execution(public * com.arc.aop.controller.*Controller.*(..))")
//    @Pointcut("execution(public  * com.arc.mp.controller.*.*Controller.*(..))")
//    public void pointcut() {
//
//    }
//
//    @Around("pointcut()")
//    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
//        long in = System.currentTimeMillis();
//        Object proceedResult = null;
//        try {
//            proceedResult = proceedingJoinPoint.proceed();
//
//        } catch (Throwable throwable) {
//            proceedResult = handleException(throwable);
//        }
//        log.info("#################################");
//        System.out.println("#################################");
//        log.info("方法耗时={}ms", System.currentTimeMillis() - in);
//        System.out.println(System.currentTimeMillis() - in);
//        System.out.println("#################################");
//        log.info("#################################");
//        return proceedResult;
//    }
//
//    private Object handleException(Throwable throwable) {
//        throwable.printStackTrace();
//        System.out.println(throwable.getCause());
//        return throwable;
//    }
//}
