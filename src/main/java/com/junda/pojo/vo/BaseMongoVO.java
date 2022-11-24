package com.junda.pojo.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 16:05
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class BaseMongoVO extends PageVO {
    private Long createTimestamp;
    private String createTimeString;
    private Long updateTimestamp;
    private String updateTimeString;
    private String createUser;
    private String createUserId;
    private String updateUser;
    private String updateUserId;
    private String delFlag;
}
