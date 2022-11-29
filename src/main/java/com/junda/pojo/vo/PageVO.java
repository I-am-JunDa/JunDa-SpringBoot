package com.junda.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
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
public class PageVO {

    @ApiModelProperty(example = "25", required = false, value = "每页数据的数量")
    private Integer pageSize=10;

    @ApiModelProperty(example = "0", required = false, value = "当前页码")
    private Integer currentNum=0;


}
