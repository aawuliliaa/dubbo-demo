package com.yupaopao.ops.dubbocon.service;

import com.yupaopao.ops.dubboproapi.bean.UserEntity;

public interface OrderService {
    UserEntity theOrderOfUser(String id);
}
