package com.junda.pojo.vo.resp;

import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 15:30
 **/
@Data
public class UserRespVO {
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
