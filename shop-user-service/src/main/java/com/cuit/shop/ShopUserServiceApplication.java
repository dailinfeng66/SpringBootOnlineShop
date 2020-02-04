package com.cuit.shop;

import com.alibaba.dubbo.config.spring.context.annotation.EnableDubbo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@EnableDubbo
@SpringBootApplication
//@EnableDubboConfiguration
@MapperScan(basePackages = "com.cuit.shop.user.mapper")
public class ShopUserServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShopUserServiceApplication.class, args);
    }

}
