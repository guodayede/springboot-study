package com.example.demo;


import org.springframework.boot.actuate.endpoint.Endpoint;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gyc
 * @Title: TestEndpoint
 * @ProjectName springboot-study
 * @Description:
 * @date 2018/12/17 15:26
 */
@Component
public class TestEndpoint implements Endpoint<List<String>> {
    @Override
    public String getId() {
        return "testEndpoint";
    }

    @Override
    public boolean isEnabled() {
        return true;
    }

    @Override
    public boolean isSensitive() {
        return true;
    }

    @Override
    public List<String> invoke() {
        List<String> messages = new ArrayList<String>();
        messages.add("This is message 1");
        messages.add("This is message 2");
        return messages;
    }
}
