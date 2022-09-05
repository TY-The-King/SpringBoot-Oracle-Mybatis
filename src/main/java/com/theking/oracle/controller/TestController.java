package com.theking.oracle.controller;

import com.theking.oracle.entity.TestDTO;
import com.theking.oracle.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class TestController {

    private final TestService testService;

    @Autowired
    public TestController(TestService testService){
        this.testService = testService;
    }

    /**
     * get test data with id
     * @param id-you want select id with user
     * @return user information
     */
    @GetMapping("/get")
    public List<TestDTO> getTest(Integer id){
        return testService.getTest(id);
    }
}
