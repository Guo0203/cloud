package com.gpf.provider.dao;

import com.gpf.api.entities.Employee;

import java.util.List;

/**
 * @Description: dao层接口
 * @package: com.gpf.provider.dao
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 11:18
 */

public interface EmployeeDao {

    Employee findById(int id);

    List<Employee> findAll();

    boolean addEmployee(Employee employee);

}
