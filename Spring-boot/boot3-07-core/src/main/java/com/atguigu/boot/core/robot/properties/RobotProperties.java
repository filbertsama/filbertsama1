package com.atguigu.boot.core.robot.properties;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties(prefix = "robot")
@Component
@Data
@NoArgsConstructor
@AllArgsConstructor
public class RobotProperties {
    private String name;
    private String age;
    private String email;
}
