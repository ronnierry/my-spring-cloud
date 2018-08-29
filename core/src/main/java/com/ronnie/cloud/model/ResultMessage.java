package com.ronnie.cloud.model;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.io.Serializable;

/**
 * @Description:
 * @Author: rongyu
 * @CreateDate: 2018/8/28$ 15:45$
 * @Remark:
 */
@Data
@AllArgsConstructor
public class ResultMessage implements Serializable {
    private String msg;
    private int code;
    private Object data;

    public ResultMessage() {
    }
}
