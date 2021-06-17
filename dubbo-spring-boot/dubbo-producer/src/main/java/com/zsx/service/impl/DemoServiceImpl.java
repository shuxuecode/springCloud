package com.zsx.service.impl;

import com.zsx.service.DemoService;
import org.apache.dubbo.config.annotation.DubboService;
import org.springframework.stereotype.Component;

import java.util.UUID;

@Component
//@DubboService
public class DemoServiceImpl implements DemoService {

    @Override
    public String name(String name) {
        return UUID.randomUUID().toString();
    }
}
