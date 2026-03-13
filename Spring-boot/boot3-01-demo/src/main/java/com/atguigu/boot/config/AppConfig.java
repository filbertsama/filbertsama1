package com.atguigu.boot.config;

import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;
import org.springframework.context.annotation.Scope;


//@Import("里面添加外部类.class) ，给容器中指定类型的组件，组件的名字默认是全类名
//@Configuration//配置类本身也是容器中的组件
@SpringBootConfiguration
public class AppConfig {


    @Scope("prototype")
    @Bean("HAHA")   //代替以前bean标签，组件在容器中的名字就是方法名（默认）（user_01）。可以直接修改注解
    public User user_01(){

        var user = new User();
        user.setId(1L);
        user.setName("张山");
        return user;

    }


}
