package com.aiden.springcloud.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @Author : Aiden
 * @Date: 2023-1-13 16:02
 */
@Data
@NoArgsConstructor
//链式写法
@Accessors(chain = true)
public class Dept implements Serializable {

    /**
     * 主键
     */
    private Long deptno;

    private String dname;

    /**
     * 来着哪个数据库,同一个信息可能存在不同数据库
     */
    private String db_source;

    public Dept(String dname) {
        this.dname = dname;
    }
}
