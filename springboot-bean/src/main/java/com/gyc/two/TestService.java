package com.gyc.two;

import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author gyc
 * @date 2018/9/6
 */
@Service
public class TestService {
    @PostConstruct
    public void init(){
        System.out.println("TestService-init");
    }

    public TestService(){
        System.out.println("TestService");
    }
    @PreDestroy
    public void destroy(){
        System.out.println("TestService-destroy");
    }
}
