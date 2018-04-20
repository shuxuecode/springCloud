package com.zsx.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zsx.service.TestService;

@Controller
public class TestController {

	@Autowired
	private TestService testService;

	@GetMapping("/demo")
	@ResponseBody
	@HystrixCommand(fallbackMethod = "testFallback")
	public String asdf(String name) {
		return testService.test(name);
	}

	public String testFallback(String name) {
		return "降级方案，参数为：" + name;
	}

}
