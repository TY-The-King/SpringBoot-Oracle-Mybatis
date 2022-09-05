package com.theking.oracle.service.impl;

import com.theking.oracle.entity.TestDTO;
import com.theking.oracle.mapper.TestMapper;
import com.theking.oracle.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author theking
 */
@Service
public class TestServiceImpl implements TestService {

    private final TestMapper testMapper;

    @Autowired
    public TestServiceImpl(TestMapper testMapper){
        this.testMapper = testMapper;
    }

    /**
     * get test data with id
     * @author theking
     * @date 2022/9/2 17:01
     * @return java.util.List<com.theking.oracle.entity.TestDTO>
     */
    public List<TestDTO> getTest(Integer id){
        return testMapper.getTest(id);
    }

    /**
     * insert to test
     * @param list-insert data
     */
    public int insert(List<TestDTO> list){
        return testMapper.insert(list);
    }

    /**
     * delete test with id
     */
    public int delete(){
        return testMapper.delete();
    }
}
