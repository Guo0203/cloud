package com.gpf.hystrix;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description: 数据中台主启动类
 * @package: com.gpf.com.gpf.datacenter
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 17:44
 */
@SpringBootApplication
//@EnableHystrix
public class CloudProviderHystrix {
    public static void main(String[] args) {
        SpringApplication.run(CloudProviderHystrix.class,args);
    }
}
