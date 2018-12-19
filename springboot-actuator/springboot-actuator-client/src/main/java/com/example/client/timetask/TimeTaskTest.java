package com.example.client.timetask;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @author gyc
 * @Title: TimeTaskTest
 * @ProjectName springboot-study
 * @Description:
 * @date 2018/12/18 10:52
 */
@Component
public class TimeTaskTest {

    @Scheduled(cron = "0/10 * * * * ? ")
    public void test(){
        System.out.println("corn定时任务");
    }

    @Scheduled(initialDelay = 1000*15 ,fixedDelay = 1000*5)
    public void testone(){
        System.out.println("aaaaaa");
    }
}
