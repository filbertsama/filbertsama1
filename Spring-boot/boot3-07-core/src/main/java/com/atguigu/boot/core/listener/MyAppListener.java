package com.atguigu.boot.core.listener;

import org.jspecify.annotations.Nullable;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.boot.bootstrap.ConfigurableBootstrapContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

import java.time.Duration;

public class MyAppListener implements SpringApplicationRunListener {
    @Override
    public void starting(ConfigurableBootstrapContext bootstrapContext) {
        System.out.println("==============正在启动================");
    }

    @Override
    public void environmentPrepared(ConfigurableBootstrapContext bootstrapContext, ConfigurableEnvironment environment) {
        System.out.println("==============配置环境================");
    }

    @Override
    public void contextPrepared(ConfigurableApplicationContext context) {
        System.out.println("==============上下文准备================");
    }

    @Override
    public void contextLoaded(ConfigurableApplicationContext context) {
        System.out.println("==============上下文加载================");
    }

    @Override
    public void started(ConfigurableApplicationContext context, @Nullable Duration timeTaken) {
        System.out.println("==============应用启动================");
    }

    @Override
    public void ready(ConfigurableApplicationContext context, @Nullable Duration timeTaken) {
        System.out.println("==============应用准备================");
    }

    @Override
    public void failed(@Nullable ConfigurableApplicationContext context, Throwable exception) {
        System.out.println("==============启动失败================");
    }
}
