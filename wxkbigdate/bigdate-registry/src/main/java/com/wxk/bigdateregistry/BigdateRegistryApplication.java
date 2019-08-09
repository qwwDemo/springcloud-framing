package com.wxk.bigdateregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BigdateRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdateRegistryApplication.class, args);
    }

}
