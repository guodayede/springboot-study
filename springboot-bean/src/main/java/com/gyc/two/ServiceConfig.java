package com.gyc.two;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

/**
 * @author gyc
 * @date 2018/9/6
 */
@Configuration
@ComponentScan("com.gyc.two")
public class ServiceConfig {

    @Bean
    TestService testService(){
        return new TestService();
    }
}
