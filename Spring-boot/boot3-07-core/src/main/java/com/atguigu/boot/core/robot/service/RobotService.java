package com.atguigu.boot.core.robot.service;

import com.atguigu.boot.core.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RobotService {

    @Autowired
    RobotProperties robotProperties;


    public String sayHello(){

//        robotProperties.setName("张三");
        return "你好:"+robotProperties.getName()+",年龄:"+robotProperties.getAge()+" ";
    }

}
