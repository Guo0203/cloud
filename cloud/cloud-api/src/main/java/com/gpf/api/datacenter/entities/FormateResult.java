package com.gpf.api.datacenter.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description: 格式化结果
 * @package: com.gpf.api.com.gpf.datacenter.entities
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:32
 */
@Data
@NoArgsConstructor
public class FormateResult<T> {
    String message = "成功";
    int code;
    Object result;
    public FormateResult(int code,Object result) {
        this.result = result;
        this.code = code;
    }

    public FormateResult(int code) {
        this.message = "失败";
        this.code = code;
    }
}
