package com.atguigu.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class welcomeController {
    @GetMapping("/well")
    public String hello(@RequestParam("name") String name, Model model){

        //把需要给页面共享的数据放到model
        model.addAttribute("msg",name);
        return "welcome";

    }
}
