package com.gyc.config;

import com.gyc.bean.CustomBean;
import com.gyc.bean.AnnotationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author gyc
 * @date 2018/9/8
 */
@Configuration
public class LifeCycleConfig {
    /**
     * 自定义bean的initMethod和destroyMethod
     * @return
     */
    @Bean(initMethod = "init",destroyMethod = "destroy")
    CustomBean customBean(){
        return new CustomBean();
    }
}
