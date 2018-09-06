package com.gyc.one;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.lang.annotation.Annotation;

/**
 * @author gyc
 * @date 2018/9/5
 */
public class Main {
    public static void main(String[] args){
        AnnotationConfigApplicationContext context=new AnnotationConfigApplicationContext(PrePostConfig.class);
        TestBean testBean = context.getBean(TestBean.class);
        context.close();
    }
}
