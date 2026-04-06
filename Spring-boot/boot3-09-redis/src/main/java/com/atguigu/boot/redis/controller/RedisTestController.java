package com.atguigu.boot.redis.controller;

import com.atguigu.boot.redis.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class RedisTestController {

    @Autowired
    RedisTemplate<Object,Object> redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/count")
    public String count(){
        ValueOperations<String, String> stringStringValueOperations = stringRedisTemplate.opsForValue();
        Long hello = stringStringValueOperations.increment("hello");

        return "访问了"+hello +"次";
    }

    @GetMapping("/person/save")
    public String savePerson(){

        Person person = new Person(1L, "张三", 18, new Date());

        //序列化


        redisTemplate.opsForValue().set("person",person);
        return "OK";
    }

    @GetMapping("/person/load")
    public Person getPerson(){
        Person person = (Person) redisTemplate.opsForValue().get("person");

        return person;

    }
}
