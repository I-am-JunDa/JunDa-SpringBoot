package com.junda.good.pojo.common;

import lombok.Data;
import org.springframework.data.annotation.Id;

/**
 * @author libai
 */
@Data
public class MongoIDEntity {
    @Id
    private String _id;
}
