package com.haoze.service.impl;

import com.haoze.model.demo.DemoEntity;
import com.haoze.service.DemoService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 2018/7/18.
 */
@Service
public class DemoServiceImpl implements DemoService{

    
    @Override
    public List<DemoEntity> list() {
        List<DemoEntity> demos = new ArrayList();
        DemoEntity demoEntity = new DemoEntity();
        demoEntity.setId("123");
        demoEntity.setName("demo1");
        demos.add(demoEntity);

        demoEntity = new DemoEntity();
        demoEntity.setId("456");
        demoEntity.setName("demo2");
        demos.add(demoEntity);
        return demos;
    }
}
