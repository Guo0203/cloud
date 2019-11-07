package com.gpf.myrules;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description: 自定义算法配置类
 * @package: com.gpf.myrules
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/20 17:00
 */
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule(){
        return new RandomRuleFive();
    }
}
