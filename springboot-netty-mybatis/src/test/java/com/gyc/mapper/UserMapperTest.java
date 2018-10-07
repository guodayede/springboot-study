package com.gyc.mapper;

import com.gyc.entity.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.annotation.Resource;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UserMapperTest {
    @Resource
    private UserMapper userMapper;

    @Test
    public void selectAll() {
        List<User> users = userMapper.selectAll();
        System.out.println(users.size());
    }
}