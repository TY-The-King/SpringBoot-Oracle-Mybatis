package com.theking.oracle.controller;

import com.theking.oracle.entity.TestDTO;
import com.theking.oracle.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/get")
    public List<TestDTO> getTest(){
        return testService.getTest();
    }
}
