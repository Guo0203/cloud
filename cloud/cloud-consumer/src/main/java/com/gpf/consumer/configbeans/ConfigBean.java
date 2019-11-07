package com.gpf.consumer.configbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: 注解配置类
 * @package: com.gpf.consumer.configbeans
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 16:35
 */
@Configuration
public class ConfigBean {

    /**
     * 注入RestTemplate容器
     *
     * @return RestTemplate
     */
    @Bean
//    @LoadBalanced  //Spring Cloud Ribbon是基于Netflix Ribbon实现一套客户端负载均衡工具
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //    @Bean
    public IRule myRule() {
        //将默认的负载均衡算法（轮询）替换成自定义的算法
        return new RetryRule();
    }

}
