package com.longer.service;

import com.longer.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;
/**
    统一处理熔断
 */

@Component //千万不要忘记加
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public boolean addDept(Dept dept) {
                return false;
            }

            @Override
            public Dept findById(Long id) {
                return new Dept().setDeptno(id).setDname("该ID："+id+"Consumer客户端提供的降级信息,此刻服务Provider已经关闭")
                        .setDb_source("no this database in mysql");
            }

            @Override
            public List<Dept> findAll() {
                return null;
            }
        };
    }
}
