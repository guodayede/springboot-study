package com.gyc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

/**
 * @author gyc
 * @date 2018/9/8
 */
@Component
public class LifeCycleBeanAware implements BeanNameAware,BeanFactoryAware,ApplicationContextAware {
    private static final Logger logger= LoggerFactory.getLogger(LifeCycleBeanAware.class);
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        logger.info("bean工厂");
    }

    @Override
    public void setBeanName(String s) {
        logger.info("bean的默认的名字："+s);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        logger.info("bean上下文");
    }
}
