package com.junda.service;

import com.junda.common.PageResult;
import com.junda.common.Result;
import com.junda.pojo.vo.req.UserReqVO;
import com.junda.pojo.vo.resp.UserRespVO;

import java.util.List;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 15:31
 **/
public interface UserService {
    PageResult<UserRespVO> findAll(UserReqVO userReqVO);

    Result<Object> findById(String id);

    Result<Object> deleteById(List<String> id);

    Result<Object> addUser(UserReqVO userReqVO);

    Result<Object> updateUser(UserReqVO userReqVO);
}
