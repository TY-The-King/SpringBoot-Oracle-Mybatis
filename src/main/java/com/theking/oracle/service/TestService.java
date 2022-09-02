package com.theking.oracle.service;

import com.theking.oracle.entity.TestDTO;

import java.util.List;

/**
 * @author theking
 */
public interface TestService {

    /**
     * get test table all data
     * @author theking
     * @date 2022/9/2 17:00
     * @return java.util.List<com.theking.oracle.entity.TestDTO>
     */
    public List<TestDTO> getTest();
}
