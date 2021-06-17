package com.zsx;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zsx
 */
@SpringBootApplication
@ImportResource(value = {"classpath:dubbo-consumer.xml"})
public class App {

    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}
