package com.junda.good.pojo.common;

import lombok.Data;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @author libai
 */
@Data
public class BaseMongoEntity extends MongoIDEntity{
    private Long createTimestamp;
    private String createTimeString;
    private Long updateTimestamp;
    private String updateTimeString;
    private String createUser;
    private String createUserId;
    private String updateUser;
    private String updateUserId;
    @Indexed(name = "INDEX_DEL_FLAG")
    private String delFlag;
}
