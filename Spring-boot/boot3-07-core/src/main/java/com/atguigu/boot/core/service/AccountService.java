package com.atguigu.boot.core.service;

import org.springframework.stereotype.Service;

@Service
public class AccountService {

    public void addAccountScore(String username) {

        System.out.println(username + "加1分");
    }
}
