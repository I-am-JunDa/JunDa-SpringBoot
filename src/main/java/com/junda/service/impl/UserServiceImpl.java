package com.junda.service.impl;

import cn.hutool.core.bean.BeanUtil;
import com.junda.common.PageResult;
import com.junda.common.Result;
import com.junda.pojo.entity.UserEntity;
import com.junda.common.eunm.GlobalEnum;
import com.junda.pojo.vo.req.UserReqVO;
import com.junda.pojo.vo.resp.UserRespVO;
import com.junda.service.UserService;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @describe:
 * @author: HuangXianJun
 * @version: v1.0.0
 * @date: 2022/9/2 17:05
 **/
@Service
public class UserServiceImpl implements UserService {
    @Resource
    private HttpServletRequest request;
    @Resource
    private ServerProperties serverProperties;
    
    @Resource
    private MongoTemplate mongoTemplate;
    @Override
    public PageResult<UserRespVO> findAll(UserReqVO userReqVO) {
        List<UserEntity> list = mongoTemplate.find(new Query(Criteria.where("").is(""))
                .limit(userReqVO.getPageSize())
                .skip(userReqVO.getPageSize() * (userReqVO.getCurrentNum()-1)),UserEntity.class);
        List<UserRespVO> respVOList = BeanUtil.copyToList(list, UserRespVO.class);
        return PageResult.<UserRespVO>builder()
                .count(11L)
                .data(respVOList)
                .build();
    }

    @Override
    public Result<Object> findById(String id) {
        return Result.ok("查询成功");
    }

    @Override
    public Result<Object> deleteById(List<String> id) {
        return null;
    }

    @Override
    @Async
    public Result<Object> addUser(UserReqVO userReqVO) {
        userReqVO.setDelFlag(GlobalEnum.DelStatus.NotDel.getValue());
        UserEntity userEntity = BeanUtil.copyProperties(userReqVO, UserEntity.class);
        mongoTemplate.insert(userEntity);
        return Result.ok();
    }

    @Override
    public Result<Object> updateUser(UserReqVO userReqVO) {
        return null;
    }
}
