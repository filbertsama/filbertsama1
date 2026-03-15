package com.atguigu.logging.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RestController
public class MyController {


    @GetMapping("/mylove")
    public String hello(){

        for (int i = 0; i < 1000; i++) {
            log.info("test-test");
            log.error("test-test");
            log.warn("test-test");
            log.debug("test-test");

        }

        return "Hello,SpringBoot 3";

    }

}
