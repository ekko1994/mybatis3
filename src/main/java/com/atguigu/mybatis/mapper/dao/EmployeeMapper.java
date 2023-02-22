package com.atguigu.mybatis.mapper.dao;

import com.atguigu.mybatis.mapper.bean.Employee;
import org.apache.ibatis.annotations.MapKey;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @author zhanghao
 * @date 2020/6/30 - 19:09
 */
public interface EmployeeMapper {

    //多条记录封装一个map
    @MapKey("id")
    Map<Integer, Employee> getEmpByLastNameLikeReturnMap(String lastName);

    // 返回一条记录的map
    Map<String, Object> getEmpsByIdReturnMap(Integer id);

    List<Employee> getEmpsByLastName(String lastName);

    Employee getEmpByMap(Map<String, Object> map);

    Employee getEmpByIdAndLastName(@Param("id") Integer id, @Param("lastName") String lastName);

    Employee getEmpById(Integer id);

    Long addEmp(Employee employee);

    Boolean updateEmp(Employee employee);

    void deleteEmpById(Integer id);
}
