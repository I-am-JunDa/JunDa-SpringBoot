package com.junda.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 可用于类上 和 方法上
 */
@Target({ElementType.TYPE,ElementType.METHOD})
@Retention(RetentionPolicy.RUNTIME)
public @interface LogDetail {
    /**
     * 用来描述实体类的功能，便于找到日志发生的原始代码位置
     * @return
     */
    String value() default "";
}
