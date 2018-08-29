package com.ronnie.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/28$ 14:12$
 * @Remark:
 */
@EnableFeignClients
@SpringBootApplication
@EnableDiscoveryClient
public class FeignApplication {
    public static void main(String[] args) {
        SpringApplication.run(FeignApplication.class, args);
    }
}
