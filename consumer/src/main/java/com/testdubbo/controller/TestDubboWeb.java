package com.testdubbo.controller;

import com.testdubbo.service.TestDubboService;
import org.apache.dubbo.config.annotation.Reference;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestDubboWeb {

    @Reference
    private TestDubboService testDubboService;

    @RequestMapping("/test/{user}")
    public String getData(@PathVariable("user") String user) {
        System.out.println("TestDubboWeb.getData");
        return testDubboService.getData(user);
    }
}
