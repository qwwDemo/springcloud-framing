package com.wxk.bigdatehelpcenter.controller;


import com.wxk.bigdatehelpcenter.domain.User;
import com.wxk.bigdatehelpcenter.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author qian
 * @version 1.0
 * @date 2019/7/10 16:21
 */
@RestController
@RefreshScope
public class OrderBenefitController {
    //远程数据源测试
//    @Value("${datasource.driver-class-name}")
//    String driver;
//    @Value("${datasource.jdbc-url}")
//    String url;
//    @Value("${datasource.username}")
//    String userName;
//    @Value("${datasource.password}")
//    String password;
//
//    @RequestMapping("/hello")
//    public String getConfig() {
//        return ("驱动"+driver+"地址"+url+"用户名"+userName+"密码"+password);
//    }

    @Autowired
    private UserService userService;

    @RequestMapping("/hi")
    public List<User> finaAll(){
     List<User> list=userService.findAll();
     return list;
    }
}
