package com.atguigu.boot3.security.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@EnableMethodSecurity //开启方法级别的权限控制安全注解
@Configuration
public class AppSecurityConfiguration {


    @Bean
    SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

        http.authorizeHttpRequests(registry->{
            registry.requestMatchers("/").permitAll() //首页所有人都允许
                    .anyRequest().authenticated(); //其余任意请求都需要认证

        });

        //表单登录功能:开启表单登录,提供默认登录页
        http.formLogin(formLogin->{
            formLogin.loginPage("/login").permitAll(); //自定义登录页位置
        });

//        http.formLogin();
        return http.build();

    }


    @Bean //查询用户详情
    UserDetailsService userDetailsService(PasswordEncoder passwordEncoder){
        UserDetails lisi = User.withUsername("lisi")
                .password(passwordEncoder.encode("123456"))
                .roles("common")
                .authorities("file_read")
                .build();
        UserDetails wangwu = User.withUsername("wangwu")
                .password(passwordEncoder.encode("123456"))
                .roles("hr")
                .authorities("file_write", "file_read")
                .build();
        UserDetails laoliu = User.withUsername("laoliu")
                .password(passwordEncoder.encode("123456"))
                .roles("admin")
                .authorities("file_read")
                .build();
        InMemoryUserDetailsManager manager = new InMemoryUserDetailsManager(lisi,wangwu,laoliu);

        return manager;

    };

    @Bean
    PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }
}
