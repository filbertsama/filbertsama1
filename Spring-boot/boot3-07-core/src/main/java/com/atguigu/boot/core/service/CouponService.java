package com.atguigu.boot.core.service;

import com.atguigu.boot.core.entity.UserEntity;
import com.atguigu.boot.core.event.LoginSuccessEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;

@Service
public class CouponService {

    @EventListener
    public void onEvent(LoginSuccessEvent loginSuccessEvent){
        System.out.println("=======CouponService=====感知到事件"+loginSuccessEvent);
        UserEntity source = (UserEntity) loginSuccessEvent.getSource();
        sendCoupon(source.getUsername());
    }

    public void sendCoupon(String username ){

        System.out.println(username +"catch coupon");
    }
}
