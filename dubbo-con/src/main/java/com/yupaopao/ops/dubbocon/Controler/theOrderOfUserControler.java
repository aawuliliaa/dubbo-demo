package com.yupaopao.ops.dubbocon.Controler;

import com.yupaopao.ops.dubbocon.service.OrderService;
import com.yupaopao.ops.dubboproapi.bean.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class theOrderOfUserControler {
    @Autowired
    OrderService orderService;
    @ResponseBody   //以json格式返回
    @RequestMapping("/theOrderOfUser")
    public UserEntity theOrderOfUser(@RequestParam("uid") String userId){
        System.out.println("uid---"+userId);
        return orderService.theOrderOfUser(userId);
    }
}
