package com.gpf.api.datacenter.entities;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @package: com.gpf.api.com.gpf.datacenter.entities
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/28 18:39
 */
@Data
@NoArgsConstructor
public class TopoRequest {
    @NotNull
    private String sblx;//设备类型（必传）
    @NotNull
    private String psrid;//设备ID（必传）

    private String typeid;//设备子类型（必传）

    private String sbzlx;//设备子类型

    private int inputvol;//电压等级：指所查设备电压小于等于此电压

    private int normopen;//常开状态

    private int switchstate;//开关状态

    private int pswitchstate;//长开状态

    private int switchuse;//开关作用

    private int toSblx;//终止设备类型

    private int limitvol;//最低低压等级：指所查设备低压大于此电压

    private int step;//步数

    private String limitid;//限制ID:指拓扑搜索到此设备为止

    private String limitself;//除掉自己：只在停电模拟分析中使用到
    //@NotNull
    private String token;//权限验证（注解为是否开启）

}
