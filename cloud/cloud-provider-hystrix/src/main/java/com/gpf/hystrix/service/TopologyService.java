package com.gpf.hystrix.service;

import com.gpf.api.datacenter.entities.PsrEquip;
import com.gpf.api.datacenter.entities.TopoRequest;

import java.util.List;

/**
 * @Description: 业务层接口
 * @package: com.gpf.com.gpf.datacenter.service
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:42
 */
public interface TopologyService {

    List<PsrEquip> searchData(String methodName,TopoRequest condition);
}
