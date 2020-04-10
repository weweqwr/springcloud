package com.longer.controller;

import com.longer.entities.Dept;
import com.longer.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Comsumer {
    @Autowired
   private DeptClientService service;


    @RequestMapping(value = "consumer/dept/get/{id}")
    public Dept findById(@PathVariable("id")Long id){
        return this.service.findById(id);
    }
    @RequestMapping(value = "consumer/dept/add")
    public boolean addDept(Dept dept){
        return this.service.addDept(dept);
    }
    @RequestMapping(value = "consumer/dept/findAll")
    public List<Dept> findAll(){
        return this.service.findAll();
    }

}
