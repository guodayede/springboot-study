package com.gyc.one;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * @author gyc
 * @date 2018/9/5
 */
@Configuration
@ComponentScan("com.gyc.one")
public class PrePostConfig {
    @Bean(initMethod = "init",destroyMethod = "destroy")
    TestBean testBean(){
        return new TestBean();
    }
}
