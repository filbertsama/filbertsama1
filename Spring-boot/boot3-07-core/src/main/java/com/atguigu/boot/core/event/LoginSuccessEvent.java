package com.atguigu.boot.core.event;

import com.atguigu.boot.core.entity.UserEntity;
import org.springframework.context.ApplicationEvent;

import java.time.Clock;

/*
登录成功事件
 */
public class LoginSuccessEvent extends ApplicationEvent {

    public LoginSuccessEvent(UserEntity source) {
        /*
        UserEntity 代表谁登录成功
         */
        super(source);
    }

    public LoginSuccessEvent(Object source, Clock clock) {
        super(source, clock);
    }
}
