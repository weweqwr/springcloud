package com.longer.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
名字和数据库的相同，类表关系映射
 */
@AllArgsConstructor
@NoArgsConstructor
@Data//设置
@Accessors(chain = true)//设置访问为链式风格访问
public class Dept implements Serializable {
    //必须要序列化
    private Long deptno;//主键
    private String dname;//部门名称
    private String db_source;//来自哪个数据库，应为微服务架构可以一个服务对应一个个数据库，通一个信息被存储到不同数据库\


}
