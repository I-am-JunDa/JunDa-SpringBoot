package com.junda.good.service.impl;

import com.junda.good.pojo.common.JunDaResult;
import com.junda.good.pojo.entity.UserEntity;
import com.junda.good.pojo.eunm.GlobalEnum;
import com.junda.good.pojo.vo.req.UserReqVO;
import com.junda.good.service.UserService;
import com.junda.good.util.IPUtils;
import com.junda.good.util.JunDaBeanUtil;
import org.springframework.boot.autoconfigure.web.ServerProperties;
import org.springframework.data.mongodb.core.MongoTemplate;
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
    public JunDaResult<Object> findAll(UserReqVO userReqVO) {
        return null;
    }

    @Override
    public JunDaResult<Object> findById(String id) {
        return JunDaResult.ok("查询成功");
    }

    @Override
    public JunDaResult<Object> deleteById(List<String> id) {
        return null;
    }

    @Override
    @Async
    public JunDaResult<Object> addUser(UserReqVO userReqVO) {
        String ipAddr = IPUtils.getIpAddr(request);
        System.out.println("ipAddr = " + ipAddr);
        System.out.println("serverProperties.getPort() = " + serverProperties.getPort());
        userReqVO.setDelFlag(GlobalEnum.DelStatus.NotDel.getValue());
        UserEntity userEntity = JunDaBeanUtil.copy(userReqVO, UserEntity.class);
        mongoTemplate.insert(userEntity);
        return JunDaResult.ok();
    }

    @Override
    public JunDaResult<Object> updateUser(UserReqVO userReqVO) {
        return null;
    }
}
