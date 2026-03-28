package com.atguigu.boot.stater.robot;

import com.atguigu.boot.stater.robot.controller.RobotController;
import com.atguigu.boot.stater.robot.properties.RobotProperties;
import com.atguigu.boot.stater.robot.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({RobotController.class, RobotProperties.class, RobotService.class})
public class RobotAutoConfiguration {


}
