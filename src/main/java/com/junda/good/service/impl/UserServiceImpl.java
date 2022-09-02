package com.junda.good.service.impl;

import com.junda.good.pojo.common.JunDaResult;
import com.junda.good.pojo.vo.req.UserReqVO;
import com.junda.good.service.UserService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 17:05
 **/
@Service
public class UserServiceImpl implements UserService {
    @Override
    public JunDaResult<Object> findAll(UserReqVO userReqVO) {
        return null;
    }

    @Override
    public JunDaResult<Object> findById(String id) {
        return null;
    }

    @Override
    public JunDaResult<Object> deleteById(List<String> id) {
        return null;
    }

    @Override
    public JunDaResult<Object> addUser(UserReqVO userReqVO) {
        return null;
    }

    @Override
    public JunDaResult<Object> updateUser(UserReqVO userReqVO) {
        return null;
    }
}
