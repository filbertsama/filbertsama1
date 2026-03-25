package com.atguigu.web.config;

import com.atguigu.web.bean.Cat;
import com.atguigu.web.component.MyYamlHttpMessageConverter;
import lombok.NonNull;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.http.CacheControl;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import java.util.List;
import java.util.concurrent.TimeUnit;

//@EnableWebMvc
@SpringBootConfiguration
public class MyConfig /* implements WebMvcConfigurer */{

//    @Override
//    public void addResourceHandlers(ResourceHandlerRegistry registry) {
//        WebMvcConfigurer.super.addResourceHandlers(registry);
//
//        registry.addResourceHandler("/static/**").addResourceLocations("classpath:/source1/","classpath:/source2/").setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
//    }

    @Bean
    public WebMvcConfigurer webMvcConfigurer(){
        return getWebMvcConfigurer();

    }

    private static @NonNull WebMvcConfigurer getWebMvcConfigurer() {
        return new WebMvcConfigurer() {
            @Override
            public void addResourceHandlers(ResourceHandlerRegistry registry) {
                registry.addResourceHandler("/static/**")
                        .addResourceLocations("classpath:/source1/", "classpath:/source2/")
                        .setCacheControl(CacheControl.maxAge(1180, TimeUnit.SECONDS));
                ;
            }

            @Override
            public void configureMessageConverters(List<HttpMessageConverter<?>> converters) {
                converters.add(new MyYamlHttpMessageConverter());
            }
        };
    }

    @Bean
    public Cat cat(){

        return new Cat();
    }

}
