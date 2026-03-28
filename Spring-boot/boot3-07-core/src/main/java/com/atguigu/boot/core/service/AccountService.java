package com.atguigu.boot.core.service;

import com.atguigu.boot.core.entity.UserEntity;
import com.atguigu.boot.core.event.LoginSuccessEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Service;

@Service
public class AccountService implements ApplicationListener<LoginSuccessEvent> {
    @Override
    public void onApplicationEvent(LoginSuccessEvent event) {
        UserEntity source = (UserEntity)event.getSource();
        addAccountScore(source.getUsername());
    }

    public void addAccountScore(String username) {

        System.out.println(username + "加1分");
    }
}
