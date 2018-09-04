package com.gyc.demo;

import com.gyc.demo.nettysocket.DiscardServer;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.annotation.Resource;

@SpringBootApplication
public class DemoApplication implements CommandLineRunner {
    @Resource
    private DiscardServer discardServer;

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        discardServer.run(8080);
    }
}
