package com.atguigu.boot.core.service;

import com.atguigu.boot.core.entity.UserEntity;
import com.atguigu.boot.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class SysService {

    @EventListener
    public void onEvent(LoginSuccessEvent loginSuccessEvent){
        UserEntity source = (UserEntity) loginSuccessEvent.getSource();
        recordLog(source.getUsername());

    }

    public void recordLog(String username){
        System.out.println(username +"登录信息已被记录");

    }
}
