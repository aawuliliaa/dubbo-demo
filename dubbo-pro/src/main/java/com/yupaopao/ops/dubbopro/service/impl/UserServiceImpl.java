package com.yupaopao.ops.dubbopro.service.impl;

import com.yupaopao.ops.dubboproapi.bean.UserEntity;
import com.yupaopao.ops.dubboproapi.service.UserService;
import org.springframework.stereotype.Component;
import com.alibaba.dubbo.config.annotation.Service;
//@Service注释一定要是dubbo的
@Service
@Component
public class UserServiceImpl implements UserService {
    @Override
    public UserEntity getUserDetail(String id) {
        UserEntity user = new UserEntity();
        user.setId("1");
        user.setName("lili");
        return user;
    }
}
