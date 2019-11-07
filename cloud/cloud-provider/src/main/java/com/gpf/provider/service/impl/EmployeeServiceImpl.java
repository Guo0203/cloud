package com.gpf.provider.service.impl;

import com.gpf.api.entities.Employee;
import com.gpf.provider.dao.EmployeeDao;
import com.gpf.provider.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 员工业务层实现类
 * @package: com.gpf.provider.service.impl
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 11:30
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired(required = false)
    private EmployeeDao employeeDao;

    @Override
    public Employee get(int id) {
        return employeeDao.findById(id);
    }

    @Override
    public List<Employee> list() {
        return employeeDao.findAll();
    }

    @Override
    public boolean add(Employee employee) {
        return employeeDao.addEmployee(employee);
    }

}
