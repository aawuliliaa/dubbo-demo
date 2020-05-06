package com.yupaopao.ops.dubbopro;


import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//加上该注释
@EnableDubbo
@SpringBootApplication
public class DubboProApplication {

    public static void main(String[] args) {
        SpringApplication.run(DubboProApplication.class, args);
    }

}
