package com.gyc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.stereotype.Component;

/**
 * @author gyc
 * @date 2018/9/8
 */
@Component
public class LifeCycleProcessor implements BeanPostProcessor {
    private static final Logger logger= LoggerFactory.getLogger(LifeCycleProcessor.class);
    private static final String DEFAULT_BEAN_NAME="annotationBean";
    /**
     *在bean初始化之前执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        if(DEFAULT_BEAN_NAME.equals(beanName)){
            logger.info("bean初始化之前执行："+beanName);
        }
        return bean;
    }
    /**
     *bean初始化之后执行
     * @param bean
     * @param beanName
     * @return
     * @throws BeansException
     */
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(DEFAULT_BEAN_NAME.equals(beanName)){
            logger.info("bean初始化之后执行："+beanName);
        }
        return bean;
    }
}
