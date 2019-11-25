package com.example.async.service;

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
//    @Async("asyncTaskExecutor")
    void testAsync();
}
