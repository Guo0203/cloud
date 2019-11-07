package com.gpf.consumer;

import com.gpf.myrules.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @Description: 消费端主启动类
 * @package: com.gpf.consumer
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 16:59
 */
@SpringBootApplication
@EnableEurekaClient
/**
 * ribbon自定义算法用于CLOUDPROVIDER-8001这个微服务（注意ribbon自定的包不能放在@ComponentScan注解的包以及子包下面）
 */
@RibbonClient(name="CLOUDPROVIDER-8081",configuration = MySelfRule.class)
public class CloudConsumer8082 {
    public static void main(String[] args) {
        SpringApplication.run(CloudConsumer8082.class,args);
    }
}
