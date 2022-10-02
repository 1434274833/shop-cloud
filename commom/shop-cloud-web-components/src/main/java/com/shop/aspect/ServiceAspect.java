package com.shop.aspect;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class ServiceAspect {
    final Logger log = LoggerFactory.getLogger(ServiceAspect.class);

    @Around("execution(* com.shop..*service.impl..*.*(..))")
    public Object recodeTimeLog(ProceedingJoinPoint joinPoint) throws Throwable {
        Class className = joinPoint.getTarget().getClass();
        log.info("开始执行 {}.{}", className, joinPoint.getSignature().getName());
        long begin = System.currentTimeMillis();
        Object result = joinPoint.proceed();
        long end = System.currentTimeMillis();
        long takeTime = end - begin;
        if (takeTime > 3000) {
            log.error("执行结束，耗时：{} 毫秒", takeTime);
        } else if (takeTime > 2000) {
            log.warn("执行结束，耗时：{} 毫秒", takeTime);
        } else {
            log.info("执行结束，耗时：{} 毫秒", takeTime);
        }
        return result;
    }
}
