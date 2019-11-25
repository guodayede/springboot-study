package com.example.async.timetask;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.Scheduled;

/**
 * @author gyc
 * @title: TestScheduling
 * @projectName test
 * @date 2019/11/1311:54
 * @description:
 */
//@Component
public class TestScheduling {
    private static final Logger log = LoggerFactory.getLogger(TestScheduling.class);
    @Async("asyncTaskExecutor")
    @Scheduled(initialDelay = 1000 * 60, fixedDelay = 1000 * 30)
    public void testOne() {
        //打印线程名字
        log.info("ThreadName:====one====" + Thread.currentThread().getName());
    }
    @Async("asyncTaskExecutor")
    @Scheduled(initialDelay = 1000 * 60, fixedDelay = 1000 * 30)
    public void testTwo() {
        //打印线程名字
        log.info("ThreadName:====two====" + Thread.currentThread().getName());
    }
}