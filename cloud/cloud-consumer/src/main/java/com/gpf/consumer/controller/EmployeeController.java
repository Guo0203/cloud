package com.gpf.consumer.controller;

import com.alibaba.fastjson.JSON;
import com.gpf.api.datacenter.constants.URLConstants;
import com.gpf.api.datacenter.entities.StationLine;
import com.gpf.api.entities.Employee;
import com.gpf.api.datacenter.entities.GraphResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;


/**
 * @Description: 消费端，消费provider端生产的数据
 * @package: com.gpf.consumer.controller
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 16:40
 */
@RestController
public class EmployeeController {

    @Autowired
    private RestTemplate restTemplate;


    @RequestMapping(value = "/consumer/employee/get/{id}")
    public Employee get(@PathVariable int id) {
        return restTemplate.getForObject(URLConstants.REST_URL_PREFIX + "/employee/get/" + id, Employee.class);
    }

    @RequestMapping(value = "/consumer/employee/add")
    public boolean add(Employee employee) {
        return restTemplate.postForObject(URLConstants.REST_URL_PREFIX + "/employee/add", employee, Boolean.class);
    }

    @RequestMapping(value = "/consumer/employee/list")
    public List<Employee> list() {
        return restTemplate.getForObject(URLConstants.REST_URL_PREFIX + "/employee/list", List.class);
    }

    @RequestMapping(value = "/consumer/employee/discovery")
    public Object discovery() {
        return restTemplate.getForObject(URLConstants.REST_URL_PREFIX + "/employee/discovery", Object.class);
    }

    @RequestMapping(value = "consumer/graph/test")
    public GraphResponse testJson() {
        String str = restTemplate.getForObject(URLConstants.GRAPH_URL_PEFIX, String.class);
        GraphResponse graphResponse = JSON.parseObject(str, GraphResponse.class);
        return graphResponse;
    }

    @RequestMapping(value = "consumer/pg/test")
    public boolean testPg() {
        StationLine stationLine = new StationLine();
        stationLine.setOperId(1);
        stationLine.setLineId("4321");
        return restTemplate.postForObject("http://localhost:8090/data-center/testPg",stationLine,Boolean.class);
    }

    @RequestMapping(value = "consumer/getMessageBody",method = RequestMethod.GET)
    public String getMessageBody(String message){
        return message;
    }

}
