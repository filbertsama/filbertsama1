package com.atguigu.web.controller;

import com.atguigu.web.bean.Cat;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@ResponseBody
//@Controller

@RestController
public class HelloController {


    @GetMapping("/hello")
    public String hello(){
        return "Hello,SpringBoot 3";

    }

//    @Bean
    @GetMapping("/cat")
    public Cat cat(){
        return new Cat();



    }

}
