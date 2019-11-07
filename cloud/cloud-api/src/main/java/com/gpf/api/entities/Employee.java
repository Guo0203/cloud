package com.gpf.api.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

/**
 * @Description: 类表映射实体类
 * @package: com.gpf.api.entities
 * @Auther: Pengfei.Guo
 * @Date: Created in 2019/10/12 10:47
 */
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@SuppressWarnings("serial")
public class Employee implements Serializable {

    private Integer id;
    private String empName;

    private String email;
    //1 male, 0 female
    private Integer gender;
    private String department;
    private String birth;
    private String workDate;

}
