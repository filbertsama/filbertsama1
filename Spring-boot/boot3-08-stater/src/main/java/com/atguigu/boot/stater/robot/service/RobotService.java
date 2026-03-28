package com.atguigu.boot.stater.robot.service;

import com.atguigu.boot.stater.robot.properties.RobotProperties;
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
