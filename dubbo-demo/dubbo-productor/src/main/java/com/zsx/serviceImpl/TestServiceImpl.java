package com.zsx.serviceImpl;


import org.springframework.stereotype.Service;

import com.zsx.service.TestService;

@Service("testService")
public class TestServiceImpl implements TestService {

	public String test(String name) {
		return "!@# " + name;
	}

}
