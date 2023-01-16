package com.aiden.springcloud.controller;

import com.aiden.springcloud.pojo.Dept;
import com.aiden.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

/**
 * @Author : Aiden
 * @Date: 2023-1-14 10:27
 */
@RestController
public class DeptConsumerController {

    //弃用直接调用
//    private static final String REST_URL_PREFIX = "http://localhost:8081";
    //通过服务名访问
//    private static final String REST_URL_PREFIX = "http://springcloud-provider-dept";

    @Autowired
    private DeptClientService deptClientService;

    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id) {
        return deptClientService.queryById(id);
    }

    @RequestMapping("/consumer/dept/add")
    public boolean add(Dept dept) {
        return deptClientService.addDept(dept);
    }

    @RequestMapping("/consumer/dept/list")
    public List<Dept> list() {
        return deptClientService.queryAll();
    }
}
