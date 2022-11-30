package com.junda.annotation;

import com.junda.common.eunm.DateEnum;
import com.junda.common.eunm.GlobalEnum;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 日期转换注解
 */
@Target({ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
public @interface DateTran {

    /**
     * 原始值的字段
     */
    String source() default "";
    /**
     * 原始值的字段的类型
     */
    DateEnum sourceType();
    /**
     * 原始值的字段的类型 格式 YYYY-MM-dd / YYYY-MM-dd HH:mm:SS 等
     */
    String sourceTypeFormat() default "";
    /**
     * 目标值的字段的类型
     */
    String resultType() default "";

}
