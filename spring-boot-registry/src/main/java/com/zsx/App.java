package com.zsx;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class App {

	public static void main(String[] args) {
		new SpringApplicationBuilder(App.class).web(true).run(args);
	}

}
