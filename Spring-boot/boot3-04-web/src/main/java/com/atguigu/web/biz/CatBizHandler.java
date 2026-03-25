package com.atguigu.web.biz;

import com.atguigu.web.bean.Cat;
import jakarta.servlet.ServletException;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.web.servlet.function.ServerRequest;
import org.springframework.web.servlet.function.ServerResponse;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

@Slf4j
@Service
public class CatBizHandler {

    public ServerResponse getCat(ServerRequest request) throws Exception{
        String id = request.pathVariable("id");

        log.info("查询{}用户信息 成功",id);
        Cat cat = new Cat(1L,"lll");

        return ServerResponse
                .ok()
                .body(cat);

    }

    public ServerResponse getCats(ServerRequest request) throws Exception{
        log.info("查询所有信息 成功");
        List<Cat> list = Arrays.asList(new Cat(1L, "lll"), new Cat(2L, "ss"), new Cat(3L, "lwwwll"), new Cat(4L, "lrrrll"));

        return ServerResponse
                .ok()
                .body(list);

    }

    public ServerResponse saveCat(ServerRequest request) throws ServletException, IOException {
        Cat body = request.body(Cat.class);

        log.info("save{} 成功",body);
        return ServerResponse.ok().build();

    }


    public ServerResponse updateCat(ServerRequest request) {

        log.info("信息更新 成功");
        return ServerResponse.ok().build();
    }


    public ServerResponse delateCat(ServerRequest request) {
        log.info("删除 成功");
        return ServerResponse.ok().build();
    }
}
