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
    private final AsyncTest asyncTest;

    @Autowired
    public AsyncServiceImpl(AsyncTest asyncTest) {
        this.asyncTest = asyncTest;
    }

    @Override
    public void testAsync(){
        /*try {
            Thread.sleep(1000*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        log.info("========testAsync运行=========="+Thread.currentThread().getName());
        log.info("========testAsync是否守护线程=========="+Thread.currentThread().isDaemon());
    }
    @Override
    public void testOne(){
       /* try {
            Thread.sleep(1000*60);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }*/
        log.info("ThreadName:===one===="+Thread.currentThread().getName());
        log.info("守护线程:===one===="+Thread.currentThread().isDaemon());
    }
}