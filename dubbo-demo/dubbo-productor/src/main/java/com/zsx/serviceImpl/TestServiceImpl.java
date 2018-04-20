package com.zsx.serviceImpl;


import org.springframework.stereotype.Service;

import com.zsx.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	@Override
	public String test(String name) {

		try {
			Thread.sleep(10*1000L);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		return "hello  " + name;
	}

}
