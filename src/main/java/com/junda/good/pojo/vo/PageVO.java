package com.junda.good.pojo.vo;

import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/3 9:00
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class PageVO extends MongoIDVO{
    /**
     * 每页数据的数量
     */
    private Integer pageSize=25;

    /**
     * 页码
     */
    private Integer pageNum=0;

}
