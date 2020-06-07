package com.example.methodinterceptor.config;

import com.example.methodinterceptor.annotation.InterceptorAnnotation;
import com.example.methodinterceptor.interceptor.MyInterceptor;
import org.springframework.aop.Advisor;
import org.springframework.aop.support.DefaultPointcutAdvisor;
import org.springframework.aop.support.annotation.AnnotationMatchingPointcut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class InterceptorConfig {
    //注意该地址为项目具体包地址
    public static final String traceExecution = "execution(* com.example.methodinterceptor..*.*(..))";
//    public static final String traceExecution = "annotation(com.example.methodinterceptor.annotation.InterceptorAnnotation)";


   /* @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor2() {
        MyInterceptor interceptor = new MyInterceptor();
        AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
        pointcut.setExpression(traceExecution);

        // 配置增强类advisor
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(interceptor);
        return advisor;
    }*/
   /* @Bean
    public DefaultPointcutAdvisor defaultPointcutAdvisor() {
        JdkRegexpMethodPointcut pointcut = new JdkRegexpMethodPointcut();
        pointcut.setPattern("com.example.methodinterceptor.*");
        // 配置增强类advisor
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(new MyInterceptor());
        System.out.println(advisor.toString());
        return advisor;
    }*/

    @Bean
    public Advisor pointcutAdvisor() {
        MyInterceptor interceptor = new MyInterceptor();

        AnnotationMatchingPointcut pointcut = new AnnotationMatchingPointcut(null,InterceptorAnnotation.class);
        // 配置增强类advisor
        DefaultPointcutAdvisor advisor = new DefaultPointcutAdvisor();
        advisor.setPointcut(pointcut);
        advisor.setAdvice(interceptor);
        System.out.println(advisor.toString());
        return advisor;
    }
}
