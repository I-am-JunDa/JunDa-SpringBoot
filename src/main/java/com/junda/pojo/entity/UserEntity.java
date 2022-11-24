package com.junda.pojo.entity;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

/**
 * @author libai
 * 用户实体
 */
@Data
@Document("tb_user")
public class UserEntity {
    @Id
    private String _id;
    /**
     * 用户名
     */
    private String userName;
    /**
     * 用户密码
     */
    private String userPassword;
    /**
     * 用户昵称
     */
    private String nikeName;
    /**
     * 用户邮箱
     */
    private String email;
    /**
     * 用户电话
     */
    private String phoneNumber;
    /**
     * 用户性别
     */
    @Indexed(name = "INDEX_SEX")
    private Integer sex;
    /**
     * 用户出年月
     */
    private String birthday;

    /**
     * 用户创建时间时间戳【精确到毫秒】
     */
    private Long createTimestamp;
    /**
     * 用户创建时间
     */
    private String createTimeString;
    /**
     * 用户最近修改时间戳【精确到毫秒】
     */
    private Long updateTimestamp;
    /**
     * 用户修改时间
     */
    private String updateTimeString;
    /**
     * 用户删除标记
     */
    @Indexed(name = "INDEX_DEL_FLAG")
    private String delFlag;
}
