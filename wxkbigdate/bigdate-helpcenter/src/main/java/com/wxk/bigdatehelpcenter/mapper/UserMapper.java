package com.wxk.bigdatehelpcenter.mapper;

import com.wxk.bigdatehelpcenter.domain.User;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author: qww
 * @vsersion 1.0
 * @Date: 2019/8/8 9:18
 */
@Repository
public interface UserMapper {
    List<User> findAll();
}
