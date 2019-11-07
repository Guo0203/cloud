package com.gpf.api.datacenter.util;

import com.gpf.api.datacenter.entities.FormateResult;
import com.gpf.api.datacenter.entities.PsrEquip;


/**
 * @Description:
 * @package: com.gpf.api.com.gpf.datacenter.util
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:44
 */
public class ResultUtil {

    public static FormateResult success(Object result) {
        return new FormateResult(200,result);
    }

    public static FormateResult fail() {
        return new FormateResult(302);
    }
}
