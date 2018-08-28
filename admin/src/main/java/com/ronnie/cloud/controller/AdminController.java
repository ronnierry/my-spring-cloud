package com.ronnie.cloud.controller;

import com.ronnie.cloud.model.ResultMessage;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/28$ 15:41$
 * @Remark:
 */
@RestController
public class AdminController {
    @GetMapping("all")
    public ResultMessage all() {
        return new ResultMessage("SUCCESS", 200, "admin");
    }
}
