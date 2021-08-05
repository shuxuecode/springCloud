package com.zsx.config;


import com.deepoove.swagger.dubbo.annotations.EnableDubboSwagger;
import org.apache.dubbo.config.ApplicationConfig;
import org.apache.dubbo.config.ProtocolConfig;
import org.apache.dubbo.config.RegistryConfig;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;



// todo zsx

@Configuration
@DubboComponentScan(basePackages = {"com.zsx"})

@EnableDubboSwagger
public class DubboSwaggerConfig {


//    @Bean
//    public ApplicationConfig applicationConfig() {
//        ApplicationConfig applicationConfig = new ApplicationConfig();
//        applicationConfig.setName("dubbo-example-app");
//        applicationConfig.setOwner("Sayi");
//        return applicationConfig;
//    }

    @Bean
    public RegistryConfig registryConfig() {
        RegistryConfig registryConfig = new RegistryConfig();
        registryConfig.setAddress("zookeeper://127.0.0.1:2181");
        registryConfig.setClient("curator");
        return registryConfig;
    }

//    @Bean
//    public ProtocolConfig protocolConfig() {
//        ProtocolConfig protocol = new ProtocolConfig();
//        protocol.setName("dubbo");
//        protocol.setPort(29880);
//        return protocol;
//    }

}
