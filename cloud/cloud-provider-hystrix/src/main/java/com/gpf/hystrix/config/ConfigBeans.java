package com.gpf.hystrix.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Description: Configuration配置类
 * @package: com.gpf.hystrix.config
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/29 10:51
 */
@Configuration
public class ConfigBeans {

    /**
     * 注入RestTemplate容器
     *
     * @return RestTemplate
     */
    @Bean
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
}
