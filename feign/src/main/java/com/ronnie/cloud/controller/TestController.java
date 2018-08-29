package com.ronnie.cloud.controller;

import com.ronnie.cloud.Remote.AdminRemote;
import com.ronnie.cloud.model.ResultMessage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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

    @GetMapping("feign")
    public ResultMessage feignTest() {
        ResultMessage resultMessage = adminRemote.fetchAll();
        return resultMessage;
    }

    @GetMapping("rest")
    public ResultMessage restTest() {
        ResponseEntity<ResultMessage> forEntity = restTemplate.getForEntity("http://ADMIN/ADMIN/all", ResultMessage.class);
        ResultMessage result;
        if (forEntity.getStatusCode() == HttpStatus.OK) {
            result = forEntity.getBody();
        } else {
            result = new ResultMessage("ERROR", 500, null);
        }
        return result;
    }

}
