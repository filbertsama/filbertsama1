package com.atguigu.boot.stater.robot.annotation;

import com.atguigu.boot.stater.robot.RobotAutoConfiguration;
import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
@Documented
@Import({RobotAutoConfiguration.class})
public @interface EnableRobot {
}
