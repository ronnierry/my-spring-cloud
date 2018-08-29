package com.ronnie.cloud.controller;

import com.ronnie.cloud.Remote.AdminRemote;
import com.ronnie.cloud.model.ResultMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/28$ 16:10$
 * @Remark:
 */
@Slf4j
@RestController
public class TestController {
    @Resource
    private AdminRemote adminRemote;
    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("test")
    public ResultMessage test() {
       //ResponseEntity<ResultMessage> forEntity = restTemplate.getForEntity("http://"+admin.getHost()+":"+admin.getPort()+"ADMIN/all", ResultMessage.class);
        ResultMessage resultMessage = adminRemote.fetchAll();
        log.info("");
        return resultMessage;
    }
}
