package com.rongyi.core.aop;

import com.rongyi.core.util.Util;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

/**
 * 新的方法统计类（采用AOP AROUNT）
 *
 * @author wangjh7
 * @date 2017-06-07
 **/
@Aspect
@Component()
public class MethodTimeLogAdvice {

    private final static Logger logger = LoggerFactory.getLogger(MethodTimeLogAdvice.class);
    // 小于100毫秒不予显示
    private final static int DEFAULT_MIN_TIME = 100;

    //声明环绕通知
    public Object doAround(ProceedingJoinPoint pjp) throws Throwable {
        long begin = System.nanoTime();
        Object o = pjp.proceed();
        long end = System.nanoTime();
        //类名+方法名
        String name = pjp.getTarget().getClass() + "#" + pjp.getSignature().getName();
        long ts = (end - begin);
        if (0 < ts) {
            // 装换成毫秒
            ts = ts / 1000 / 1000;
        }
        // 减少打印 仅仅方法的时间大于指定毫秒
        String msg = "### func: " + name + " , consumed times = " + Util.getTimeString(ts) + " .";
        if (DEFAULT_MIN_TIME < ts) {
            logger.info(msg);
        } else {
            logger.debug(msg);
        }
        return o;
    }

    //声明环绕通知
    public void doBefore() throws Throwable {
            logger.info("do before");
    }

    //声明环绕通知
    public void doAfter() throws Throwable {
        logger.info("do after");
    }
}
