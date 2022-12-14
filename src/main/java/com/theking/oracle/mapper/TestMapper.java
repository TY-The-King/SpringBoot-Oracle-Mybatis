package com.theking.oracle.mapper;

import com.theking.oracle.entity.TestDTO;
import org.apache.ibatis.annotations.Mapper;
import java.util.List;

/**
 * @author theking
 */
@Mapper
public interface TestMapper {

    /**
     * get test table all data
     * @author theking
     * @date 2022/9/2 16:58
     * @return java.util.List<com.theking.oracle.entity.TestDTO>
     */
    List<TestDTO> getTest(Integer id);

    /**
     * insert data to test table
     * @param list-insert data
     */
    int insert(List<TestDTO> list);

    /**
     * delete data with id
     */
    int delete();
}
