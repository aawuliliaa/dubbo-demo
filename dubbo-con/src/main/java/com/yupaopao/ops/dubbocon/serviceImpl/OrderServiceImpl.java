package com.yupaopao.ops.dubbocon.serviceImpl;

import com.yupaopao.ops.dubbocon.service.OrderService;
import com.yupaopao.ops.dubboproapi.bean.UserEntity;
import com.yupaopao.ops.dubboproapi.service.UserService;
import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

@Service
public class OrderServiceImpl implements OrderService {
//    使用dubbo的@Reference，即可调用远程的service
    @Reference
    private UserService userservice;
    @Override
    public UserEntity theOrderOfUser(String id) {
        UserEntity userDetail = userservice.getUserDetail(id);
        return userDetail;
    }
}
