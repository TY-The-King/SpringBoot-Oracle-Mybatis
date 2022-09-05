package com.theking.oracle.service;

import com.theking.oracle.entity.TestDTO;

import java.util.List;

/**
 * @author theking
 */
public interface TestService {

    /**
     * get test data with id
     * @author theking
     * @date 2022/9/2 17:00
     * @return java.util.List<com.theking.oracle.entity.TestDTO>
     */
    List<TestDTO> getTest(Integer id);

    /**
     * insert data to test table
     * @param list
     */
    int insert(List<TestDTO> list);

    /**
     * delete data with id
     */
    int delete();
}
