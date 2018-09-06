package com.gyc.two;

import com.gyc.one.PrePostConfig;
import com.gyc.one.TestBean;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author gyc
 * @date 2018/9/6
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(ServiceConfig.class);
        TestService testService = context.getBean(TestService.class);
        context.close();
    }
}
