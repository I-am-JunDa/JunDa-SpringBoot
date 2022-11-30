package com.junda.aop;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.StopWatch;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class DateTranMethodAop {

    /**
     * 这里的within可以匹配到注解里面的方法
     */
    @Pointcut("@annotation(com.junda.annotation.DateTranMethod)")
    public void operationLog() {
    }

    @Around("operationLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = null;
        try {
            result = joinPoint.proceed();
        } catch (Exception e) {
            throw e;
        }
        return result;
    }

//    /**
//     * 入参校验和赋值
//     */
//    public Object[] transDate(ProceedingJoinPoint joinPoint) {
//        Object[] args = joinPoint.getArgs();
//
//        System.out.println("args = " + args);
//        return args;
//    }
//
//    /**
//     * 返回参数校验和赋值
//     */
//    public Object returnTransDate(Object object) {
//        return object;
//    }
}
