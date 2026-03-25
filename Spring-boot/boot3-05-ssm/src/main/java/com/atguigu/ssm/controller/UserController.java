package com.atguigu.ssm.controller;

import com.atguigu.ssm.bean.TUser;
import com.atguigu.ssm.mapper.UserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserMapper userMapper;


    /*
     返回user的json数据
     */
    @GetMapping("/user/{id}")
    public TUser getUser(@PathVariable("id") Long id){
        TUser user = userMapper.getUserById(id);
        return user;
    }
}
