package com.junda.controller;

import com.junda.annotation.DateTranMethod;
import com.junda.annotation.LogDetail;
import com.junda.common.PageResult;
import com.junda.common.Result;
import com.junda.execption.BusinessException;
import com.junda.pojo.vo.req.UserReqVO;
import com.junda.pojo.vo.resp.UserRespVO;
import com.junda.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author libai
 * 针对mongo数据库的增删改查
 */
@RestController
@RequestMapping("/UserController")
@Api(tags = "user接口")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    @ApiOperation("分页查询")
    private PageResult<UserRespVO> findAll(@RequestBody UserReqVO userReqVO) {
        return userService.findAll(userReqVO);
    }

    @GetMapping("/findById")
    @ApiOperation("通过id查询")
    private Result<Object> findById(@RequestParam("id") String id) {
        return userService.findById(id);
    }

    @GetMapping("/deleteByIds")
    @ApiOperation("基于id删除")
    private Result<Object> deleteById(@RequestBody List<String> ids) {
        return userService.deleteById(ids);
    }

    @PostMapping("/addUser")
    @ApiOperation("添加用户")
    private Result<Object> addUser(@RequestBody UserReqVO userReqVO) throws BusinessException {
        if(!StringUtils.hasText(userReqVO.getUserName())){
            throw new BusinessException("用户名不能为空");
        }
        System.out.println("userReqVO = " + userReqVO);
        return userService.addUser(userReqVO);
    }

    @GetMapping("/updateUser")
    @ApiOperation("更新用户")
    private Result<Object> updateUser(@RequestBody UserReqVO userReqVO) {
        return userService.updateUser(userReqVO);
    }
}
