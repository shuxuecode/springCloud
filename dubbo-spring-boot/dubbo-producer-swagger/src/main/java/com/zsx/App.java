package com.zsx;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableDubboConfig
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
