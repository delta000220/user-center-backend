package com.delta.usercenter.model.domain.request;

import lombok.Data;

import java.io.Serializable;

/**
 * 用户注册请求体
 *
 * @author delta
 */
@Data
public class UserRegisterRequest implements Serializable {

    private static final long serialVersionUID = 2949072700708665818L;

    private String userAccount;
    private  String userPassword;
    private String checkPassword;
    private  String planetCode;
}
