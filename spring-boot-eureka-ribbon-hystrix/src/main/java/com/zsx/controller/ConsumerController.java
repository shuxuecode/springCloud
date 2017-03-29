package com.zsx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zsx.service.ComputeService;

@RestController
public class ConsumerController {
	@Autowired
	private ComputeService computeService;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return computeService.addService();
	}
}

/*

验证断路器的回调
依次启动eureka-server、compute-service、eureka-ribbon工程
访问http://localhost:1111/可以看到注册中心的状态
访问http://localhost:3333/add，页面显示：30
关闭compute-service服务后再访问http://localhost:3333/add，页面显示：error

*/