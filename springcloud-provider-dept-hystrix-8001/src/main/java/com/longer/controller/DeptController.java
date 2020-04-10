package com.longer.controller;

import com.longer.entities.Dept;
import com.longer.serve.DeptService;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class DeptController {
    @Autowired
    private DeptService service=null;

    @RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
   //一旦调用服务方法失败并抛出错误信息后，会自动调用@HystrixCommand标注号的fallbackMethod调用类的指定方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    public Dept get(@PathVariable("id")Long id){
        Dept dept=this.service.findById(id);
        if (null==dept){
            throw new RuntimeException("该ID:"+id+"没有对应的信息");
        }
        return dept;
    }
    public Dept processHystrix_Get(@PathVariable("id")Long id){
        return new Dept().setDeptno(id).setDname("该ID："+id+"没有对应的信息，null--@HystrixCommand")
                .setDb_source("no this database in mysql");
    }


}
