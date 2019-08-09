package com.wxk.bigdateapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

//注册Zuul
@EnableZuulProxy
@SpringBootApplication
public class BigdateApigatewayApplication {

    public static void main(String[] args) {
        SpringApplication.run(BigdateApigatewayApplication.class, args);
    }

}
