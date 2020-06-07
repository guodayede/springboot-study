package com.example.methodinterceptor.interceptor;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println("=======");
        System.out.println(methodInvocation.getMethod().getName());
        System.out.println(methodInvocation.getMethod().getDeclaringClass().getName());
        return methodInvocation.proceed();
    }
}
