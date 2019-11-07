package com.gpf.api.datacenter.constants;

/**
 * @Description: url配置类
 * @package: com.gpf.api.com.gpf.datacenter.constants
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:50
 */
public class URLConstants {

    public static final String REST_URL_PREFIX = "http://CLOUDPROVIDER-8081";

//    public static final String GRAPH_URL_PEFIX = "http://172.16.1.198:9000/query/topology/topologySearchTotypeNew?pswitchstate=0&input=10100030821843&limitvol=0&inputvol=33&normopen=0&switchstate=536870913&input.type=psr_equip_other&step=100&switchuse=0&sblx=0";
    //gsql的前缀url
    public static final String GRAPH_URL_PEFIX = "http://172.16.1.198:9000/query/topology/";

    //gsql的方法名
    public static final String SEARCH_BY_CONDITION = "topologySearchTotypeNew?";
}
