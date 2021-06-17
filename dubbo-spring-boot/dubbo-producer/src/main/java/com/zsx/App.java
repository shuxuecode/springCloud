package com.zsx;

import org.apache.dubbo.config.spring.context.annotation.EnableDubboConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableDubboConfig

// 加载xml配置文件
@ImportResource(value = {"classpath:dubbo-provider.xml"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }

}
