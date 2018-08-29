package com.ronnie.cloud.Remote;

import com.ronnie.cloud.model.ResultMessage;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/28$ 16:13$
 * @Remark:
 */
@FeignClient("ADMIN")
public interface AdminRemote {
    @GetMapping("ADMIN/all")
    ResultMessage fetchAll();
}
