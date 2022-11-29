package com.junda.controller;

import com.junda.annotation.LogDetail;
import com.junda.common.Result;
import com.junda.pojo.vo.req.UserReqVO;
import com.junda.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author libai
 * 针对mongo数据库的增删改查
 */
@RestController
@RequestMapping("/UserController")
@Api(tags = "针对mongo数据库的增删改查")
@LogDetail
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    private Result<Object> findAll(@RequestBody UserReqVO userReqVO) {
        return userService.findAll(userReqVO);
    }

    @GetMapping("/findById")
    private Result<Object> findById(@RequestParam("id") String id) {
        return userService.findById(id);
    }

    @GetMapping("/deleteByIds")
    private Result<Object> deleteById(@RequestBody List<String> ids) {
        return userService.deleteById(ids);
    }

    @GetMapping("/addUser")
    private Result<Object> addUser(@RequestBody UserReqVO userReqVO) {
        return userService.addUser(userReqVO);
    }

    @GetMapping("/updateUser")
    private Result<Object> updateUser(@RequestBody UserReqVO userReqVO) {
        return userService.updateUser(userReqVO);
    }
}
