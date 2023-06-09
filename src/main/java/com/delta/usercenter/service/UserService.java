package com.delta.usercenter.service;

import com.delta.usercenter.model.domain.User;
import com.baomidou.mybatisplus.extension.service.IService;

import javax.servlet.http.HttpServletRequest;

/**
 * 用户服务
 *
 * @author wzj
 */
public interface UserService extends IService<User> {


    /**
     * 用户注册
     *
     * @param userAccount   用户账号
     * @param userPassword  密码
     * @param checkPassword 二次确认密码
     * @param planetCode 星球编号
     * @return 新用户id
     */
    long userRegister(String userAccount, String userPassword, String checkPassword, String planetCode);


    /**
     * 用户登录
     *
     * @param userAccount  用户账号
     * @param userPassword 密码
     * @param request
     * @return 返回脱敏后的用户信息
     */
    User userLogin(String userAccount, String userPassword, HttpServletRequest request);


    /**
     * 用户脱敏
     * @param originUser
     * @return
     */
    User getSafetyUser(User originUser);

    /**
     * 用户注销
     * @param request
     * @return
     */
    int userLogout(HttpServletRequest request);
}
