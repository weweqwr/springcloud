package com.longer.controller;

import com.longer.entities.Dept;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class DeptController_Comsumer {
    //没加ribbon和eureka之前private static final String REST_URL_PREFIX="http://localhost:8001";
    private static final String REST_URL_PREFIX="http://SPRINGCLOUD-DEPT";
    @Autowired
    private RestTemplate restTemplate;
    /**
     * 使用restTemplate访问restful接口非常的简单无脑
     * （url,reuqestMap,ResonseBean.class）
     * 这三个参数分别代表Rest请求地址
     * ，请求参数，HTTP响应转换被转换成的对象类型
    */
    @RequestMapping(value="/consumer/dept/add")
    public boolean add(Dept dept){
        return restTemplate.postForObject(REST_URL_PREFIX+"/dept/add",dept,Boolean.class);
    }

    @RequestMapping(value = "/comsumer/dept/get/{id}",method = RequestMethod.GET)
    public Dept get(@PathVariable("id")Long id){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/get/"+id,Dept.class);
    }


    @RequestMapping(value = "/comsumer/dept/list",method = RequestMethod.GET)
    public List<Dept> list(){
        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/list",List.class);
    }

    @RequestMapping(value="/consumer/dept/discovery",method = RequestMethod.GET)
    public Object discovery() {

        return restTemplate.getForObject(REST_URL_PREFIX+"/dept/discovery",Object.class);
    }




}
