package com.junda.common;

import com.junda.common.constant.GlobalConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author junda
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Result<T> {
    private String msg;
    private Integer code;
    private boolean success = true;
    private T data;
    public static Result<Object> ok() {
        Result<Object> r = new Result();
        r.setCode(GlobalConstant.SUCCESS_200);
        r.setSuccess(true);
        return r;
    }

    public static Result<Object> ok(String msg) {
        Result<Object> r = new Result();
        r.setCode(GlobalConstant.SUCCESS_200);
        r.setMsg(msg);
        r.setSuccess(true);
        return r;
    }

    public static <T> Result<T> ok(T data) {
        Result<T> r = new Result();
        r.setCode(GlobalConstant.SUCCESS_200);
        r.setSuccess(true);
        r.setData(data);
        return r;
    }

    public static Result<Object> error(String msg) {
        Result<Object> r = new Result();
        r.setMsg(msg);
        r.setSuccess(false);
        return r;
    }

    public static Result<Object> error(Integer code,String msg) {
        Result<Object> r = new Result();
        r.setCode(code);
        r.setMsg(msg);
        r.setSuccess(false);
        return r;
    }
}
