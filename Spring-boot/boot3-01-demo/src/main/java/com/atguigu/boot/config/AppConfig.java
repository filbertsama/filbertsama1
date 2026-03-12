package com.atguigu.boot.config;

import com.atguigu.boot.bean.User;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration//配置类本身也是容器中的组件
public class AppConfig {


    @Bean("HAHA")   //代替以前bean标签，组件在容器中的名字就是方法名（默认）（user_01）。可以直接修改注解
    public User user_01(){

        var user = new User();
        user.setId(1L);
        user.setName("张山");
        return user;

    }


}
