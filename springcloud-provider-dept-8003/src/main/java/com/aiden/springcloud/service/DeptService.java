package com.aiden.springcloud.service;

import com.aiden.springcloud.pojo.Dept;

import java.util.List;

/**
 * @Author : Aiden
 * @Date: 2023-1-13 20:54
 */
public interface DeptService {

    boolean addDept(Dept dept);

    Dept queryByid(Long deptno);

    List<Dept> queryAll();
}
