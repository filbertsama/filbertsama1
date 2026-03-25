package com.atguigu.boot.core.service;

import org.springframework.stereotype.Service;

@Service
public class SysService {

    public void recordLog(String username){
        System.out.println(username +"登录信息已被记录");

    }
}
