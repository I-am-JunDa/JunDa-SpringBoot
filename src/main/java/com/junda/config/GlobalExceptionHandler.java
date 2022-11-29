package com.junda.config;


import com.junda.common.Result;
import com.junda.execption.BusinessException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

@RestControllerAdvice
@Slf4j
public class GlobalExceptionHandler {

    /**
     * 处理业务异常
     * @param ex
     * @return
     */
    @ExceptionHandler(BusinessException.class)
    public Result handleConnectionError(BusinessException ex) {
        log.error(ex.getMessage());
        return Result.error(ex.getCode(),ex.getMessage());
    }


}
