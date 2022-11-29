package com.junda.aop;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.date.StopWatch;
import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class LogDetailAspect {

    /**
     * 这里的within可以匹配到注解里面的方法
     */
    @Pointcut("@annotation(com.junda.annotation.LogDetail) || @within(com.junda.annotation.LogDetail)")
    public void operationLog() {
    }

    @Around("operationLog()")
    public Object doAround(ProceedingJoinPoint joinPoint) throws Throwable {
        Object result = null;
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        try {
            result = joinPoint.proceed();
        } catch (Exception e) {
            stopWatch.stop();
            saveLog(false,joinPoint, DateUtil.formatBetween(stopWatch.getLastTaskTimeMillis()));
            throw e;
        }
        stopWatch.stop();
        saveLog(true,joinPoint, DateUtil.formatBetween(stopWatch.getLastTaskTimeMillis()));
        return result;
    }

    /**
     * @param flag 成功标识
     * @param joinPoint
     * @param time  花费时间
     */
    public void saveLog(Boolean flag,ProceedingJoinPoint joinPoint, String time) {
        MethodSignature signature = (MethodSignature)joinPoint.getSignature();
        Object[] args = joinPoint.getArgs();
        if(flag){
            log.info("状态:[{}],调用的方法:[{}],入参:[{}],耗时:[{}]","请求成功",signature,args,time);
        }else {
            log.info("状态:[{}],调用的方法:[{}],入参:[{}],耗时:[{}]","请求失败",signature,args,time);
            log.error("状态:[{}],调用的方法:[{}],入参:[{}],耗时:[{}]","请求失败",signature,args,time);
        }

    }


}
