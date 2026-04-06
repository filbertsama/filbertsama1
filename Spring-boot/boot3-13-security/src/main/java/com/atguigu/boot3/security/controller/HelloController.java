package com.atguigu.boot3.security.controller;

import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/hello")
    public String hello(){

        return "hello,Springboot~";

    }

    @PreAuthorize("hasRole('hr')")
    @GetMapping("/world")
    public String world(){

        return "hello,world";

    }
}
