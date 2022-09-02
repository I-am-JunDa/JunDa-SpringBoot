package com.junda.good.pojo.common;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author junda
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class JunDaResult<T> {
    private String msg;
    private Integer code;
    private boolean success = true;
    private T data;
    public static JunDaResult<Object> ok() {
        JunDaResult<Object> r = new JunDaResult();
        r.setSuccess(true);
        return r;
    }

    public static JunDaResult<Object> ok(String msg) {
        JunDaResult<Object> r = new JunDaResult();
        r.setMsg(msg);
        r.setSuccess(true);
        return r;
    }

    public static <T> JunDaResult<T> ok(T data) {
        JunDaResult<T> r = new JunDaResult();
        r.setSuccess(true);
        r.setData(data);
        return r;
    }
}
