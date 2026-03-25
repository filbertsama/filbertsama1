package com.atguigu.boot.core.controller;

import com.atguigu.boot.core.entity.UserEntity;
import com.atguigu.boot.core.event.EventPublish;
import com.atguigu.boot.core.event.LoginSuccessEvent;
import com.atguigu.boot.core.service.AccountService;
import com.atguigu.boot.core.service.CouponService;
import com.atguigu.boot.core.service.SysService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {

    @Autowired
    AccountService accountService;
    @Autowired
    CouponService couponService;
    @Autowired
    SysService service;

    @Autowired
    EventPublish eventPublish;

    @GetMapping("/login")
    public String login(@RequestParam("username") String username,
                        @RequestParam("passwd") String passwd){

        System.out.println("业务处理登录完成");


        //todo 发送事件

        //创建事件信息
        LoginSuccessEvent event = new LoginSuccessEvent(new UserEntity(username, passwd));

        //发送事件
        eventPublish.sendEvent(event);


        accountService.addAccountScore(username);

        couponService.sendCoupon(username);

        service.recordLog(username);

        return "登录成功";
    }


}
