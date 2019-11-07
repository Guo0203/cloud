package com.gpf.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description: eureka服务端主启动类
 * @package: com.gpf.eureka
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/15 15:48
 */
@SpringBootApplication
@EnableEurekaServer //开启服务端
public class EurekaServer8000 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer8000.class, args);
    }
}
