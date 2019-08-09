package com.wxk.bigdatehelpcenter.service.impl;

import com.wxk.bigdatehelpcenter.domain.User;
import com.wxk.bigdatehelpcenter.mapper.UserMapper;
import com.wxk.bigdatehelpcenter.service.UserService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author: qww
 * @vsersion 1.0
 * @Date: 2019/8/8 9:18
 */
@Slf4j
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;
    @Override
    public  List<User> findAll(){
        List<User> list=userMapper.findAll();
        return list;
    }
}
