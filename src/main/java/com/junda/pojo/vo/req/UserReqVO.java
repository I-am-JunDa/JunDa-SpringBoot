package com.junda.pojo.vo.req;

import com.junda.pojo.vo.PageVO;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import org.springframework.data.mongodb.core.index.Indexed;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 15:30
 **/
@Data
@EqualsAndHashCode(callSuper=false)
public class UserReqVO  extends PageVO {

    @ApiModelProperty(example = "gfwf24fdg43qfa234rfaf2f32", required = false, value = "用户唯一id")
    private String _id;

    @ApiModelProperty(example = "李达", required = false, value = "用户名")
    private String userName;

    @ApiModelProperty(example = "hjkllkj123AA", required = false, value = "用户密码")
    private String userPassword;

    @ApiModelProperty(example = "李大", required = false, value = "用户昵称")
    private String nikeName;

    @ApiModelProperty(example = "17283598@qq.com", required = false, value = "用户邮箱")
    private String email;

    @ApiModelProperty(example = "18342314567", required = false, value = "用户电话")
    private String phoneNumber;

    @ApiModelProperty(example = "1", required = false, value = "用户性别")
    @Indexed(name = "INDEX_SEX")
    private Integer sex;

    @ApiModelProperty(example = "2010-02-14", required = false, value = "用户出年月")
    private String birthday;

    @ApiModelProperty(example = "1669708515000", required = false, value = "用户创建时间时间戳【精确到毫秒】")
    private Long createTimestamp;

    @ApiModelProperty(example = "2022-11-12", required = false, value = "用户创建时间")
    private String createTimeString;

    @ApiModelProperty(example = "1669708515000", required = false, value = "用户最近修改时间戳【精确到毫秒】")
    private Long updateTimestamp;

    @ApiModelProperty(example = "2022-11-12", required = false, value = "用户修改时间")
    private String updateTimeString;

    @ApiModelProperty(example = "100", required = false, value = "用户删除标记")
    @Indexed(name = "INDEX_DEL_FLAG")
    private String delFlag;
}
