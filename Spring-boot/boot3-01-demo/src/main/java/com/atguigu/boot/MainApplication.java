package com.atguigu.boot;

import com.atguigu.boot.bean.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication //这是一个springboot应用
public class MainApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext run = SpringApplication.run(MainApplication.class, args);

        for (String beanDefinitionName : run.getBeanDefinitionNames()) {

            System.out.println(beanDefinitionName);
        }

        String[] beanNamesForType = run.getBeanNamesForType(User.class);
        for (String s : beanNamesForType) {
            System.out.println(s);

        }

        Object user01 = run.getBean("HAHA");
        Object cat = run.getBean("cat");
//        System.out.println(user02 == user01);

        System.out.println(cat);
    }
}
