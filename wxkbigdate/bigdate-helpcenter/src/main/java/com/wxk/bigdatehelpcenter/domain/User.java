package com.wxk.bigdatehelpcenter.domain;

import lombok.Data;

/**
 * @author: qww
 * @vsersion 1.0
 * @Date: 2019/8/8 9:17
 */
@Data
public class User {

    private Integer userId;

    private String userName;

    private String password;

    private String token;
}
