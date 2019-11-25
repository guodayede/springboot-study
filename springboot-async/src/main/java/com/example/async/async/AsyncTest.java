package com.example.async.async;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

/**
 * @author gyc
 * @title: AsyncTest
 * @projectName test
 * @date 2019/11/1314:06
 * @description: TODO
 */
@Component
public class AsyncTest {
    private static final Logger log= LoggerFactory.getLogger(AsyncTest.class);
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