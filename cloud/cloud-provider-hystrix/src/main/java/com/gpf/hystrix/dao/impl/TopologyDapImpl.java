package com.gpf.hystrix.dao.impl;

import com.alibaba.fastjson.JSON;
import com.gpf.api.datacenter.constants.URLConstants;
import com.gpf.api.datacenter.entities.GraphResponse;
import com.gpf.api.datacenter.entities.PsrEquip;
import com.gpf.api.datacenter.entities.ResultList;
import com.gpf.hystrix.dao.TopologyDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Description: 拓扑实现类
 * @package: com.gpf.com.gpf.datacenter.dao.impl
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 21:48
 */
@Repository
public class TopologyDapImpl implements TopologyDao {

    @Autowired
    private RestTemplate restTemplate;

    /**
     * 拓扑搜索
     * @param url
     * @return
     */
    @Override
    public List<PsrEquip> searchTopology(String url) {
        String str = restTemplate.getForObject(URLConstants.GRAPH_URL_PEFIX + url, String.class);
        GraphResponse graphResponse = JSON.parseObject(str, GraphResponse.class);
        return resultsFormatting(graphResponse);
    }

    /**
     * 将gsql取出来值，进行封装
     * @param graphResponse
     * @return
     */
    public List<PsrEquip> resultsFormatting(GraphResponse graphResponse) {
        List<String> results = graphResponse.getResults();

        ResultList resultTopo = JSON.parseObject(results.get(0), ResultList.class);
        List<PsrEquip> psrEquips = resultTopo.getResult();

        return psrEquips;
    }

}
