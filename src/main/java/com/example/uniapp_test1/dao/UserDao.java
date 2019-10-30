package com.example.uniapp_test1.dao;

import com.example.uniapp_test1.mapper.UserMapper;
import com.example.uniapp_test1.pojo.User;
import com.example.uniapp_test1.pojo.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/10/29 10:47
 * @Description: 沈泽鹏写点注释吧
 */
@Repository
public class UserDao {
    @Autowired
    private UserMapper userMapper;

    public User findUserById(Long id){
        return userMapper.selectByPrimaryKey(id);
    }

    public List<User> findUserBydUsernameAndPassword(String phoneNumber,String password){
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andPhoneNumberEqualTo(phoneNumber)
                .andPasswordEqualTo(password);
        return userMapper.selectByExample(userExample);
    }

    public List<User> findUserByWxOpenId(String wxOpenId){
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andWxOpenIdEqualTo(wxOpenId);
        return userMapper.selectByExample(userExample);
    }

    public List<User> findUserBySpOpenId(String spOpenId){
        UserExample userExample=new UserExample();
        userExample.createCriteria()
                .andSpOpenIdEqualTo(spOpenId);
        return userMapper.selectByExample(userExample);
    }

    public Integer updateUserById(User user){
        return userMapper.updateByPrimaryKeySelective(user);
    }

    public Integer insertUser(User user){
        return userMapper.insert(user);
    }
}
