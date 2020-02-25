package com.testdubbo.service.impl;

import com.testdubbo.service.TestDubboService;
import org.apache.dubbo.config.annotation.Service;

@Service
public class TestDubboServiceImpl implements TestDubboService {
    @Override
    public String getData(String user) {
        System.out.println("TestDubboServiceImpl.getData");
        return "Test 通讯....." + user;
    }
}
