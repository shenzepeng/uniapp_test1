package com.example.uniapp_test1.request;

import lombok.Data;

/**
 * @Auther: szp
 * @Date: 2019/12/29 00:38
 * @Description: 沈泽鹏写点注释吧
 */
@Data
public class AddUserRequest {


    private String phoneNumber;

    private String headUrl;

    private Short sex;

    private String address;

    private String shortIntroduce;


    private String password;

    private String nickName;
}
