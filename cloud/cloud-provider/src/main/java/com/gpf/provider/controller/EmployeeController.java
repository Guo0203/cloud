package com.gpf.provider.controller;

import com.gpf.api.entities.Employee;
import com.gpf.provider.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 员工信息控制层
 * @package: com.gpf.provider.controller
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 13:36
 */
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private DiscoveryClient discoveryClient;

    /**
     * 按照id查找员工信息
     * @param id,员工id
     * @return Employee，员工信息
     */
    @RequestMapping(value="/employee/get/{id}",method = RequestMethod.GET)
    public Employee get(@PathVariable("id") int id){
        return employeeService.get(id);
    }

    /**
     * 添加员工
     * @param employee
     * @return boolean，是否添加成功
     */
    @RequestMapping(value = "/employee/add",method = RequestMethod.POST)
    public boolean add(@RequestBody Employee employee){
        return employeeService.add(employee);
    }

    /**
     * 查找所有员工
     * @return list
     */
    @RequestMapping(value = "/employee/list",method = RequestMethod.GET)
    public List<Employee>  list(){
        return employeeService.list();
    }

    /**
     * eureka的服务查找
     * @return
     */
    @RequestMapping(value = "/employee/discovery",method = RequestMethod.GET)
    public Object discovery(){
        List<String> list = discoveryClient.getServices();
        System.out.println("==========="+list);
        List<ServiceInstance> serviceList = discoveryClient.getInstances("cloudProvider_8081");
        for(ServiceInstance element:serviceList){
            System.out.println(element.getServiceId()+"\t"+element.getHost()+"\t"+element.getPort());
        }
        return this.discoveryClient;
    }

}
