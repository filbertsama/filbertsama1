package com.atguigu.boot.stater.robot.controller;

import com.atguigu.boot.stater.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RobotController {

    @Autowired
    RobotService robotService;


    @GetMapping(value = "/robot/hello", produces = "text/plain;charset=UTF-8")
    public String sayHello(){

        String s = robotService.sayHello();



        return s;
    }
}
