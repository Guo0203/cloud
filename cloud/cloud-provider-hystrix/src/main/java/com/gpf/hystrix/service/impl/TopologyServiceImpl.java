package com.gpf.hystrix.service.impl;

import com.gpf.api.datacenter.entities.PsrEquip;
import com.gpf.api.datacenter.entities.TopoRequest;
import com.gpf.hystrix.dao.TopologyDao;
import com.gpf.hystrix.service.TopologyService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.List;

/**
 * @Description: 业务层实现类
 * @package: com.gpf.com.gpf.datacenter.service.impl
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:48
 */
@Service
@Slf4j
public class TopologyServiceImpl implements TopologyService {

    @Autowired
    private TopologyDao topologyDao;

    /**
     *
     * @param methodName 将要调用的sql方法
     * @param condition 未处理的参数
     * @return
     */
    @Override
    public List<PsrEquip> searchData(String methodName,TopoRequest condition) {
        condition.setStep(100);
        return topologyDao.searchTopology(packageParams(methodName,condition));
    }

    /**
     * 将参数封装成符合条件的url
     * @param methodName
     * @param condition
     * @return
     */
    public String packageParams(String methodName, TopoRequest condition) {
        StringBuffer stringBuffer = new StringBuffer();
        stringBuffer.append(methodName);
        //input参数
        stringBuffer.append("input=");
        stringBuffer.append(condition.getSblx());
        stringBuffer.append(condition.getPsrid());
        //inputvol参数
        stringBuffer.append("&inputvol=");
        stringBuffer.append(condition.getInputvol());
        //normopen参数
        stringBuffer.append("&normopen=");
        stringBuffer.append(condition.getNormopen());
        //switchstate参数
        stringBuffer.append("&switchstate=");
        stringBuffer.append(condition.getSwitchstate());
        //pswitchstate参数
        stringBuffer.append("&pswitchstate=");
        stringBuffer.append(condition.getPswitchstate());
        //switchuse参数
        stringBuffer.append("&switchuse=");
        stringBuffer.append(condition.getSwitchuse());
        //limitvol参数
        stringBuffer.append("&limitvol=");
        stringBuffer.append(condition.getLimitvol());
        //sblx参数
        stringBuffer.append("&sblx=");
        stringBuffer.append(condition.getToSblx());
        //step参数
        stringBuffer.append("&step=");
        stringBuffer.append(condition.getStep());
        //limitid参数
        if(!StringUtils.isEmpty(condition.getLimitid())){
            stringBuffer.append("&limitid=");
            stringBuffer.append(condition.getLimitid());
        }
        stringBuffer.append("&input.type=psr_equip_other");
        return stringBuffer.toString();

    }
}
