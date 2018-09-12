package com.zsx.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.zsx.agent.ServerAgent;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.UUID;

@RestController
public class ConsumerController {

//    @Reference(check = false)//启动消费者不检查服务者是否存在
//    @Reference(url = "dubbo://127.0.0.1:20888") // 这种方式直接指定url
    @Reference(url = "dubbo://10.0.75.1:20888")
    public ServerAgent serverAgent;

    @RequestMapping(value = "/uuid", method = RequestMethod.GET)
    public String uuid() {
        return serverAgent.formatUUID(UUID.randomUUID().toString());
    }
}
