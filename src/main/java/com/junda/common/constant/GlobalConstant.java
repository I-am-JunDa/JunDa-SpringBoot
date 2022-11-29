package com.junda.common.constant;

/**
 * 常量添加
 * 可以自定义添加常量用于解决 魔法值
 */
public class GlobalConstant {

    public static Integer SUCCESS_200 = 200; //统一成功标识
    public static Integer FAIL_500 = 500; //统一失败标识

    /**
     * 数据库和数据异常 550-559
     */
    public static Integer FAIL_DB_550 = 550; //数据库链接异常
    public static Integer FAIL_DB_551 = 551; //数据重复
    public static Integer FAIL_DB_552 = 552; //数据校验失败
    public static Integer FAIL_DB_553 = 553; //空数据

    /**
     * 权限异常 560-569
     */
    public static Integer AUTHORITY_560 = 560; //权限异常
    public static Integer AUTHORITY_561 = 561; //没有权限
    public static Integer AUTHORITY_562 = 562; //权限过期

    /**
     * 文件异常 570-579
     */
    public static Integer FILE_570 = 570; //文件异常
    public static Integer FILE_571 = 571; //文件为空
    public static Integer FILE_572 = 572; //文件过大
    public static Integer FILE_573 = 573; //文件过小

    /**
     * 网络异常 580-589
     */
    public static Integer NETWORK_580 = 580; //网络异常
    public static Integer NETWORK_581 = 581; //网络超时



}
