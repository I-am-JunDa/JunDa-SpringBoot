package com.junda.execption;

import com.junda.common.constant.GlobalConstant;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode(callSuper = false)
public class BusinessException extends Exception {
    private Integer code = GlobalConstant.FAIL_500;

    public BusinessException(String message) {
        super(message);
    }

    public BusinessException(String message, Integer code) {
        super(message);
        this.code = code;
    }
}
