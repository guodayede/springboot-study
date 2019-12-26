package com.example.async.service;


import org.springframework.scheduling.annotation.Async;

/**
 * @author gyc
 * @title: AsyncService
 * @projectName test
 * @date 2019/11/1312:31
 * @description:
 */
public interface AsyncService {
    /**
     * 测试
     */
    @Async
    void testAsync();

    /**
     *测试一
     */
    @Async
    void testOne();
}
