package com.example.uniapp_test1.request;

import lombok.Data;

import java.util.Date;

/**
 * @Auther: szp
 * @Date: 2019/12/29 00:29
 * @Description: 沈泽鹏写点注释吧
 */

@Data
public class UserRequest {
    private Long id;

    private String phoneNumber;

    private String headUrl;

    private Short sex;

    private String address;

    private String shortIntroduce;


    private String password;

    private String nickName;
}
