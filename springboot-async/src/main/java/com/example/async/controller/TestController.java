package com.example.async.controller;

import com.example.async.service.AsyncService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author gyc
 * @title: TestController
 * @projectName test
 * @date 2019/11/1311:49
 * @description:
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private static final Logger log= LoggerFactory.getLogger(TestController.class);
    @Autowired
    private AsyncService asyncService;
    @GetMapping
    public String test(){
        //获取开始时间
        long startTime = System.currentTimeMillis();
        asyncService.testAsync();
//        asyncService.testAsync();
//        asyncService.testAsync();
        //获取结束时间
        long endTime = System.currentTimeMillis();
        log.info("========test==controller运行时间=========="+(endTime - startTime));
        return "SUCCESS";
    }
}