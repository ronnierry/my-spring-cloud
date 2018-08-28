package com.ronnie.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/28$ 15:45$
 * @Remark:
 */
@Data
@AllArgsConstructor
public class ResultMessage {
    private String msg;
    private int code;
    private Object data;
}
