package com.aiden.springcloud.controller;

import com.aiden.springcloud.service.DeptService;
import com.aiden.springcloud.pojo.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : Aiden
 * @Date: 2023-1-13 20:59
 */
@RestController
@EnableEurekaClient
public class DeptController {

    @Autowired
    private DeptService deptService;

    @PostMapping("/dept/add")
    public boolean addDept(Dept dept) {
        return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept addDept(@PathVariable("id") Long id) {
        return deptService.queryByid(id);
    }

    @GetMapping("/dept/list")
    public List<Dept> addDept() {
        return deptService.queryAll();
    }

    /**
     * 注册进来的微服务, 获取一些信息
     *
     * @return
     */
    public Object discovery(){

        return null;
    }
}
