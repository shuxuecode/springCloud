package com.zsx.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

// 使用@FeignClient("compute-service")注解来绑定该接口对应compute-service服务
@FeignClient(value = "compute-service", fallback = ComputeClientHystrix.class) 
public interface ComputeClient {

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);

}
