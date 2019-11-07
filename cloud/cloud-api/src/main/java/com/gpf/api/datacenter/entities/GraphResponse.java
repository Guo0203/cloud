package com.gpf.api.datacenter.entities;

import lombok.Data;

import java.util.List;

/**
 * @Description:
 * @package: com.gpf.consumer.entities
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/18 16:44
 */
@Data
public class GraphResponse {

    private String version;

    private boolean error;

    private String message;

    private List<String> results;
}
