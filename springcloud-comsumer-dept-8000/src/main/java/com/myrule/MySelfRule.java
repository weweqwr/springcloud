package com.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//自定义负载军和规则不能和springboot启动类同级
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule(){
//        return new RandomRule();
//        return new RoundRobinRule();
        return new Random_ZY();//每台机器五次,轮询
    }
}
