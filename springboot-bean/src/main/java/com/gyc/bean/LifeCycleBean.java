package com.gyc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Component;

/**
 * @author gyc
 * @date 2018/9/8
 */
@Component
public class LifeCycleBean implements InitializingBean,DisposableBean {
    private static final Logger logger= LoggerFactory.getLogger(LifeCycleBean.class);
    @Override
    public void destroy() throws Exception {
        logger.info("LifeCycleBean-destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        logger.info("LifeCycleBean-afterPropertiesSet");
    }
}
