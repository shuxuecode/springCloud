package com.zsx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.consul.discovery.ConsulDiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ConsumerController {

    @Autowired
    RestTemplate restTemplate;

    @Autowired
    ConsulDiscoveryClient consulDiscoveryClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add() {

        List<String> services = consulDiscoveryClient.getServices();
        System.out.println();
        for (String service : services) {
            System.out.println(service);
        }

        String object = this.restTemplate.getForObject("http://localhost:8082/add?a=10&b=20", String.class);
        return object;
    }
}
