package com.atguigu.boot.core.service;

import org.springframework.stereotype.Service;

@Service
public class CouponService {

    public void sendCoupon(String username ){

        System.out.println(username +"catch coupon");
    }
}
