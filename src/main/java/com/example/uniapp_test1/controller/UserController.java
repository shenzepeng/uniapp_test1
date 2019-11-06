package com.example.uniapp_test1.controller;

import com.example.uniapp_test1.common.SzpJsonResult;
import com.example.uniapp_test1.pojo.User;
import com.example.uniapp_test1.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.models.auth.In;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 * @Auther: szp
 * @Date: 2019/10/30 09:39
 * @Description: 沈泽鹏写点注释吧
 */
@Api("UserController")
@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation("findUserByUseId")
    @GetMapping("/ifo/{id}")
    public SzpJsonResult<User> findUserByUseId(@PathVariable("id") Long id){
        return SzpJsonResult.ok(userService.findUserById(id));
    }
    @ApiOperation("findUserByWxOpenId")
    @GetMapping("/ifo/{wxOpenId}")
    public SzpJsonResult<User> findUserByWxOpenId(@PathVariable("wxOpenId") String wxOpenId){
        return SzpJsonResult.ok(userService.findUserByWxOpenId(wxOpenId));
    }
    @ApiOperation("findUserBySpOpenId")
    @GetMapping("/ifo/{spOpenId}")
    public SzpJsonResult<User> findUserBySpOpenId(@PathVariable("spOpenId")String spOpenId){
        return SzpJsonResult.ok(userService.findUserBySpOpenId(spOpenId));
    }
    @ApiOperation("findUserBySpOpenId")
    @GetMapping("login")
    public SzpJsonResult<User> findUserBySpOpenId(@RequestParam(value = "phoneNumber",required = true) String phoneNumber,
                                                  @RequestParam(value = "password",required = true) String password){
        return SzpJsonResult.ok(userService.findUserByPhoneNumberAndPassword(phoneNumber, password));
    }
    @ApiOperation("updateUserById")
    @PutMapping
    public SzpJsonResult<Integer> updateUserById(@RequestBody User user){
        return SzpJsonResult.ok(userService.updateUser(user));
    }
    @ApiOperation("insertUser")
    @PutMapping
    public SzpJsonResult<Integer> insertUser(@RequestBody User user){
        return SzpJsonResult.ok(userService.insertUser(user));
    }
}
