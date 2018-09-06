package com.gyc.one;

/**
 * @author gyc
 * @date 2018/9/5
 */
public class TestBean {
    public void init(){
        System.out.println("bean-init");
    }
    public TestBean(){
        System.out.println("bean初始化-TestBean");
    }

    public void destroy(){
        System.out.println("one-destroy");
    }
}
