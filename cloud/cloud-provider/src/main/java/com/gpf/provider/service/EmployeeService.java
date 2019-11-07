package com.gpf.provider.service;

import com.gpf.api.entities.Employee;

import java.util.List;

/**
 * @Description: 员工业务层
 * @package: com.gpf.provider.service
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 11:28
 */
public interface EmployeeService {

    Employee get(int id);

    List<Employee> list();

    boolean add(Employee employee);
}
