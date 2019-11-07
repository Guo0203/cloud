package com.gpf.api.datacenter.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.sql.Timestamp;

/**
 * @Description:
 * @package: com.epgis.datacenter.bean.stationline
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/31 09:33
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class StationLine {
    /**
     * 表rel_station_line和rel_line_trans
     * 拥有的公共字段
     */
    private long operId;                    //本实体唯一标识
    private String lineId;                  //线路ID
    private String lineName;                //线路名称
    private String lineType;                //线路类别
    private Timestamp recordTimestamp;      //变更时间点
    private Timestamp dataTime;             //关系生成时间

    /**
     * 表rel_station_line拥有字段
     */
    private String stationId;               //电站ID
    private String stationName;             //电站名称

    /**
     * 表rel_line_trans拥有字段
     */
    private String tranId;                  //变压器ID
    private String tranType;                //变压器类别
    private String tranName;                //变压器名称
    private String tranTable;               //变压器类型
}
