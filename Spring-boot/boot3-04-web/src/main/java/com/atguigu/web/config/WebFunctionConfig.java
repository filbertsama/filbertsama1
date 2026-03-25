package com.atguigu.web.config;

import com.atguigu.web.bean.Cat;
import com.atguigu.web.biz.CatBizHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.web.servlet.function.*;

@Configuration
public class WebFunctionConfig {

    @Bean
    public RouterFunction<ServerResponse> userRouter(CatBizHandler catBizHandler){


        return RouterFunctions.route()
                .GET("/cat/{id}", RequestPredicates.accept(MediaType.ALL),catBizHandler::getCat)
                .GET("/cats",catBizHandler::getCats)
                .POST("/cat",RequestPredicates.accept(MediaType.APPLICATION_JSON),catBizHandler::saveCat)
                .PUT("/cat/{id}",RequestPredicates.accept(MediaType.APPLICATION_JSON),catBizHandler::updateCat)
                .DELETE("/cat/{id}",catBizHandler::delateCat).build();

    }
}
