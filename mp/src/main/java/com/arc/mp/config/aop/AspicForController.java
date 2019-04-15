package com.arc.mp.config.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

/**
 * @author 叶超
 * @since 2019/4/15 17:31
 */
@Component
@Aspect
public class AspicForController {

    //    @Pointcut("execution(public * com.arc.aop.controller.*Controller.*(..))")
    @Pointcut("execution(public  * com.arc.mp.controller.*.*Controller.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object doAround(ProceedingJoinPoint proceedingJoinPoint) {
        Object result = null;
        try {
            proceedingJoinPoint.proceed();
        } catch (Throwable throwable) {
              result=   handleException(throwable);
        }

        return result;
    }

    private Object handleException(Throwable throwable) {
        throwable.printStackTrace();
        System.out.println(throwable.getCause());
        return throwable;
    }
}
