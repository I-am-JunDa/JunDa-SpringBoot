package com.junda.pojo.vo.req;

import com.junda.pojo.vo.BaseMongoVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 15:30
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class UserReqVO extends BaseMongoVO {
    private String userName;
    private String userPassword;
    private String nikeName;
    private String email;
    private String phoneNumber;
    private Integer sex;
    private Integer birthday;
    private Integer age;
}
