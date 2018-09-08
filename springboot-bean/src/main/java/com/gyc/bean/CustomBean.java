package com.gyc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author gyc
 * @date 2018/9/5
 * 用于自定义配置bean
 */
public class CustomBean {
    private final static Logger logger = LoggerFactory.getLogger(CustomBean.class);
    public void init(){
        logger.info("CustomBean-init");
    }

    public void destroy(){
        logger.info("CustomBean-destroy");
    }
}
