package com.longer.cfgbean;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RetryRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration //等于applicaitionContext.xml
public class Configbean {
    @Bean
    @LoadBalanced //Springcloud ribbon基于Netflix Ribbon实现得的一套客户端 负载均衡工具
   public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }
//    @Bean
//    public IRule muRule(){
//        //return new RandomRule();//达到的目的，用我们重新选择的随机算法代替默认的轮询。
//        return new RetryRule();//默认是轮询，当服务不可用，就跳过该服务
//    }
}
