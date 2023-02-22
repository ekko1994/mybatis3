package com.atguigu.mybatis.mapper.dao;

import com.atguigu.mybatis.mapper.bean.Employee;

import java.util.List;

/**
 * @author zhanghao
 * @date 2020/7/1 - 9:20
 */
public interface EmployeeMapperPlus {

    Employee getEmpById(Integer id);

    Employee getEmpAndDept(Integer id);

    Employee getEmpByStep(Integer id);

    List<Employee> getEmpsByDeptId(Integer deptId);
}
