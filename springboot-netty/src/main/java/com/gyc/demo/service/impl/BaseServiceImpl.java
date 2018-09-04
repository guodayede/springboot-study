package com.gyc.demo.service.impl;

import com.gyc.demo.service.BaseService;
import org.springframework.stereotype.Service;

@Service
public class BaseServiceImpl implements BaseService {
    @Override
    public void test() {
        System.out.println("aaaaa");
    }
}
