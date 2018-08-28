package com.ronnie.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/28$ 14:12$
 * @Remark:
 */
@SpringBootApplication
@EnableEurekaServer
public class CloudApplication {
    public static void main(String[] args) {
        SpringApplication.run(CloudApplication.class, args);
    }
}
