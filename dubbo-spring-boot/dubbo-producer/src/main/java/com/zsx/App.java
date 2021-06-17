package com.zsx;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableDubboConfig
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}