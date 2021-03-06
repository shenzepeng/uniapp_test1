package com.example.uniapp_test1.service.impl;

import com.example.uniapp_test1.dao.UserDao;
import com.example.uniapp_test1.pojo.User;
import com.example.uniapp_test1.request.AddUserRequest;
import com.example.uniapp_test1.request.UserRequest;
import com.example.uniapp_test1.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.CollectionUtils;
import org.springframework.util.StringUtils;

import java.util.Date;
import java.util.List;

/**
 * @Auther: szp
 * @Date: 2019/10/30 10:11
 * @Description: 沈泽鹏写点注释吧
 */
@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public User findUserById(Long id) {
        return userDao.findUserById(id);
    }

    @Override
    public User findUserByPhoneNumberAndPassword(String phoneNumber, String password) {
        List<User> userBydUsernameAndPassword = userDao.findUserBydUsernameAndPassword(phoneNumber, password);
        if (!CollectionUtils.isEmpty(userBydUsernameAndPassword)) {
            return userBydUsernameAndPassword.get(0);
        } else {
            return null;
        }
    }

    @Override
    public User findUserByWxOpenId(String wxOpenId) {
        List<User> userByWxOpenId = userDao.findUserByWxOpenId(wxOpenId);
        if (CollectionUtils.isEmpty(userByWxOpenId)) {
            return userByWxOpenId.get(0);
        }
        return null;
    }

    @Override
    public User findUserBySpOpenId(String spOpenId) {
        List<User> userBySpOpenId = userDao.findUserBySpOpenId(spOpenId);
        if (CollectionUtils.isEmpty(userBySpOpenId)) {
            return userBySpOpenId.get(0);
        }
        return null;

    }

    @Override
    public Integer insertUser(AddUserRequest user) {
        if (StringUtils.isEmpty(user.getPhoneNumber())||StringUtils.isEmpty(user.getPassword())){
            return 0;
        }
        List<User> userByPhoneNumber = userDao.findUserByPhoneNumber(user.getPhoneNumber());
        User user1=new User();
        BeanUtils.copyProperties(user,user1);
        user1.setCreateTime(new Date());
        user1.setUpdateTime(new Date());
        if (CollectionUtils.isEmpty(userByPhoneNumber)){
            return userDao.insertUser(user1);
        }
        return 0;
    }

    @Override
    public Integer updateUser(UserRequest user) {
        User user1=new User();
        BeanUtils.copyProperties(user,user1);
        user1.setUpdateTime(new Date());
        return userDao.updateUserById(user1);
    }
}
