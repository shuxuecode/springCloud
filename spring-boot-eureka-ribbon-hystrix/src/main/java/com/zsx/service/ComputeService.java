package com.zsx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;

/**
 * 改造原来的服务消费方式，新增ComputeService类，在使用ribbon消费服务的函数上增加@HystrixCommand注解来指定回调方法。
 * @author A
 */
@Service
public class ComputeService {
	@Autowired
	RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "addServiceFallback")
	public String addService() {
		return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=15&b=20", String.class).getBody();
	}

	public String addServiceFallback() {
		return "error";
	}
}
