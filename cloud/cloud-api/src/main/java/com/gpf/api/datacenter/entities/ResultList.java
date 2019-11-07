package com.gpf.api.datacenter.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Description:
 * @package: com.gpf.api.datacenter.entities
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/29 15:50
 */
@Data
@NoArgsConstructor
public class ResultList {

    private List<PsrEquip> result;

}
