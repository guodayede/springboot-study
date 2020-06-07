package com.example.methodinterceptor.controller;

import com.example.methodinterceptor.annotation.InterceptorAnnotation;
import com.example.methodinterceptor.service.MyInterceptorInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {
    private final MyInterceptorInterface myInterceptorInterface;

    @Autowired
    public TestController(MyInterceptorInterface myInterceptorInterface) {
        this.myInterceptorInterface = myInterceptorInterface;
    }

    @RequestMapping("/one")
    @InterceptorAnnotation
    public String getOne(){
//        MapUtil.get("1");
        myInterceptorInterface.getMyName();
        return "SUCCESS";
    }
}
