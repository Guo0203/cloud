package com.gpf.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Description: 生产端主启动类
 * @package: com.gpf.provider
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 13:48
 */
@SpringBootApplication
@EnableDiscoveryClient //服务发现
@EnableEurekaClient  //开启eureka客户端
@MapperScan(value = "com.gpf.*.dao")
public class CloudProvider8081 {
    public static void main(String[] args) {
        SpringApplication.run(CloudProvider8081.class,args);
    }
}
