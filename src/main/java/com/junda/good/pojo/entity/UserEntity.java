package com.junda.good.pojo.entity;

import com.junda.good.pojo.common.BaseMongoEntity;
import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author libai
 * 用户实体
 */
@Data
@Document("User")
public class UserEntity extends BaseMongoEntity {
    private String userName;
    private String userPassword;
    private String nikeName;
    private String email;
    private String phoneNumber;
    @Indexed(name = "INDEX_SEX")
    private Integer sex;
    private Integer birthday;
    private Integer age;
}
