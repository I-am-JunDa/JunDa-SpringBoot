package com.junda.good.controller;

import com.junda.good.pojo.common.JunDaResult;
import com.junda.good.pojo.vo.req.UserReqVO;
import com.junda.good.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

/**
 * @author libai
 */
@RestController
@RequestMapping("/UserController")
public class UserController {

    @Resource
    private UserService userService;

    @GetMapping("/findAll")
    private JunDaResult<Object> findAll(@RequestBody UserReqVO userReqVO) {
        return userService.findAll(userReqVO);
    }

    @GetMapping("/findById")
    private JunDaResult<Object> findById(@RequestParam("id") String id) {
        return userService.findById(id);
    }

    @GetMapping("/deleteByIds")
    private JunDaResult<Object> deleteById(@RequestBody List<String> ids) {
        return userService.deleteById(ids);
    }

    @GetMapping("/addUser")
    private JunDaResult<Object> addUser(@RequestBody UserReqVO userReqVO) {
        return userService.addUser(userReqVO);
    }

    @GetMapping("/updateUser")
    private JunDaResult<Object> updateUser(@RequestBody UserReqVO userReqVO) {
        return userService.updateUser(userReqVO);
    }
}
