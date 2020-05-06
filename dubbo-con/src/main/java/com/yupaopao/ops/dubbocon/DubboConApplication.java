package com.yupaopao.ops.dubbocon;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//加上该注释
@EnableDubbo
@SpringBootApplication
public class DubboConApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboConApplication.class, args);
    }

}
