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
    @Autowired
    private AsyncTest asyncTest;
    @Override
    public void testAsync(){
        //获取开始时间
        long startTime = System.currentTimeMillis();
        asyncTest.testOne();
        asyncTest.testTwo();
        asyncTest.testThree();
        //获取结束时间
        long endTime = System.currentTimeMillis();
        log.info("========test运行时间=========="+(endTime - startTime)+"====="+Thread.currentThread().getName());
    }
    @Async
    public void testOne(){
        log.info("ThreadName:===one===="+Thread.currentThread().getName());
        try {
            Thread.sleep(1000*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Async
    public void testTwo(){
        log.info("ThreadName:====two===="+Thread.currentThread().getName());
        try {
            Thread.sleep(1000*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    @Async
    public void testThree(){
        log.info("ThreadName:====three===="+Thread.currentThread().getName());
        try {
            Thread.sleep(1000*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }


}