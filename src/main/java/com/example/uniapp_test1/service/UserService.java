package com.example.uniapp_test1.service;

import com.example.uniapp_test1.pojo.User;
import com.example.uniapp_test1.request.AddUserRequest;
import com.example.uniapp_test1.request.UserRequest;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/10/29 12:24
 * @Description: 沈泽鹏写点注释吧
 */
public interface UserService {
    /**
     * 通过主键找到user
     * @param id
     * @return
     */
    User findUserById(Long id);

    /**
     * 登录
     * @param phoneNumber
     * @param password
     * @return
     */
    User findUserByPhoneNumberAndPassword(String phoneNumber,String password);

    /**
     * 公众微信的openId
     * @param wxOpenId
     * @return
     */
    User findUserByWxOpenId(String wxOpenId);

    /**
     * 小程序的openID
     * @param spOpenId
     * @return
     */
    User findUserBySpOpenId(String spOpenId);

    /**
     * 添加用户
     * @param user
     * @return
     */
    Integer insertUser(AddUserRequest user);

    /**
     * 更新用户
     * @param user
     * @return
     */
    Integer updateUser(UserRequest user);
}
