package com.wxk.bigdateconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

//开启服务注册
@EnableEurekaClient
//开启配置服务
@EnableConfigServer
@SpringBootApplication
public class BigdateConfigserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdateConfigserverApplication.class, args);
    }

}
