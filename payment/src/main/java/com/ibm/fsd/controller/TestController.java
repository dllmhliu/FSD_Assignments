package com.ibm.fsd.controller;

import com.ibm.fsd.feign.SearchFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Value("${server.port}")
    String port;

    @Autowired
    private SearchFeign searchFeign;

    @GetMapping("/hello")
    public String hello() {
        return searchFeign.testSearch();
    }

    @GetMapping("/")
    public String home() {
        return "Hello world ,port:" + port;
    }
}
