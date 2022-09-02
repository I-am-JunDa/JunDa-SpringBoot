package com.junda.good.pojo.vo.req;

import com.junda.good.pojo.vo.BaseMongoVO;
import lombok.Data;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 15:30
 **/
@Data
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
