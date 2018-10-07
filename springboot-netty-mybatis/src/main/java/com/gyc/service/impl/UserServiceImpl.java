package com.gyc.service.impl;

import com.gyc.entity.User;
import com.gyc.mapper.UserMapper;
import com.gyc.service.UserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {
    @Resource
    private UserMapper userMapper;
    @Override
    public List<User> selectAll() {
        return userMapper.selectAll();
    }
}
