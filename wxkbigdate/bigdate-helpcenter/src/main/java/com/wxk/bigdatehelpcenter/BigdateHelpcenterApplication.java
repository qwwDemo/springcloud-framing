package com.wxk.bigdatehelpcenter;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//开启服务注册
@EnableEurekaClient
@SpringBootApplication
@MapperScan(basePackages="com.wxk.bigdatehelpcenter.mapper")
public class BigdateHelpcenterApplication {
    public static void main(String[] args) {
        SpringApplication.run(BigdateHelpcenterApplication.class, args);
    }

}
