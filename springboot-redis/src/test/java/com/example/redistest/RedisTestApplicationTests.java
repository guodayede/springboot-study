package com.example.redistest;

import com.example.redistest.model.User;
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
    @Resource
    private RedisTemplate<String,Object> redisTemplate;
    @Rule
    public ContiPerfRule i = new ContiPerfRule();

    @Test
    @PerfTest(invocations = 1, threads = 1)
    public void test() {

        redisTemplate.opsForValue().set("aa",new User("测试",23));
        Object aa = redisTemplate.opsForValue().get("aa");
        System.out.println(aa.toString());
    }

    @Test
    public void contextLoads() {
        stringRedisTemplate.opsForValue().increment("aa");
        System.out.println(Integer.valueOf(stringRedisTemplate.opsForValue().get("aa")));
    }

}

