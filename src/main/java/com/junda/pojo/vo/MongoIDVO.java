package com.junda.pojo.vo;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author libai
 */
@Data
public class MongoIDVO {
    @Id
    private String _id;
}
