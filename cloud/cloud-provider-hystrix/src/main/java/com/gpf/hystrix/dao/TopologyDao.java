package com.gpf.hystrix.dao;

import com.gpf.api.datacenter.entities.PsrEquip;

import java.util.List;

/**
 * @Description: 拓扑接口层
 * @package: com.gpf.com.gpf.datacenter.dao
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 21:47
 */
public interface TopologyDao {

     List<PsrEquip> searchTopology(String url);
}
