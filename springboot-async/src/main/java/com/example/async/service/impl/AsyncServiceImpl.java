package com.example.async.service.impl;

import com.example.async.async.AsyncTest;
import com.example.async.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author gyc
 * @title: AsyncServiceImpl
 * @projectName test
 * @date 2019/11/1312:31
 * @description:
 */
@Service
public class AsyncServiceImpl implements AsyncService {
    private static final Logger log= LoggerFactory.getLogger(AsyncServiceImpl.class);
    @Override
    public void testAsync(){
        log.info("========testAsync运行=========="+Thread.currentThread().getName());
    }
    @Override
    public void testOne(){
        log.info("ThreadName:===one===="+Thread.currentThread().getName());
    }
}