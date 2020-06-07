package com.example.methodinterceptor.service.impl;

import com.example.methodinterceptor.annotation.InterceptorAnnotation;
import com.example.methodinterceptor.service.MyInterceptorInterface;
import org.springframework.stereotype.Service;

@Service
public class MyInterceptorInterfaceImpl implements MyInterceptorInterface {
    @Override
    @InterceptorAnnotation
    public String getMyName() {
//        System.out.println("getMyName");
        return "null";
    }
}
