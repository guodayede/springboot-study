package com.gyc.bean;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

/**
 * @author gyc
 * @date 2018/9/6
 */
@Component
public class AnnotationBean {
    private static final Logger logger= LoggerFactory.getLogger(AnnotationBean.class);
    @PostConstruct
    public void init(){
       logger.info("AnnotationBean-init");
    }

    @PreDestroy
    public void destroy(){
        logger.info("AnnotationBean-destroy");
    }
}
