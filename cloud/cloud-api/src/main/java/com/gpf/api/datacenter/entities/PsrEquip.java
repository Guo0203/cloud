package com.gpf.api.datacenter.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @package: com.gpf.api.com.gpf.datacenter.entities
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:40
 */
@Data
@NoArgsConstructor
public class PsrEquip {

    private String id;

    private String psrid;

    private String sblx;

    private String sbzlx;

    private Integer voltage;

    private String name;

}
