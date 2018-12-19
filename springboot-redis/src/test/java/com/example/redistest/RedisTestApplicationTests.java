package com.example.redistest;

import org.databene.contiperf.PerfTest;
import org.databene.contiperf.junit.ContiPerfRule;
import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

@RunWith(SpringRunner.class)
@SpringBootTest
public class RedisTestApplicationTests {
    @Resource
    private StringRedisTemplate stringRedisTemplate;
    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Test
    @PerfTest(invocations = 1, threads = 1)
    public void test() {

    }

    @Test
    public void contextLoads() {
        stringRedisTemplate.opsForValue().increment("aa");
        System.out.println(Integer.valueOf(stringRedisTemplate.opsForValue().get("aa")));
    }

}

