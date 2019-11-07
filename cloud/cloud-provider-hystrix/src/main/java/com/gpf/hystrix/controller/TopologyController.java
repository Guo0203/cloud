package com.gpf.hystrix.controller;

import com.gpf.api.datacenter.constants.URLConstants;
import com.gpf.api.datacenter.entities.FormateResult;
import com.gpf.api.datacenter.entities.PsrEquip;
import com.gpf.api.datacenter.entities.TopoRequest;
import com.gpf.api.datacenter.util.ResultUtil;
import com.gpf.hystrix.service.TopologyService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Description: 控制层
 * @package: com.gpf.com.gpf.datacenter.controller
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:25
 */
@RestController
public class TopologyController {

    @Autowired
    private TopologyService topologyService;

    /**
     * 拓扑搜索
     * @param condition
     * @return
     */
    @RequestMapping(value="/searchByCondition",method = RequestMethod.GET)
    public FormateResult<PsrEquip> searchByCondition(TopoRequest condition) {
        String methodName = URLConstants.SEARCH_BY_CONDITION;
        List<PsrEquip> result = topologyService.searchData(methodName,condition);
        return ResultUtil.success(result);
    }

}
