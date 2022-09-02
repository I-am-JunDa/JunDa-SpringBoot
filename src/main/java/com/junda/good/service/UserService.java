package com.junda.good.service;

import com.junda.good.pojo.common.JunDaResult;
import com.junda.good.pojo.vo.req.UserReqVO;

import java.util.List;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 15:31
 **/
public interface UserService {
    JunDaResult<Object> findAll(UserReqVO userReqVO);

    JunDaResult<Object> findById(String id);

    JunDaResult<Object> deleteById(List<String> id);

    JunDaResult<Object> addUser(UserReqVO userReqVO);

    JunDaResult<Object> updateUser(UserReqVO userReqVO);
}
