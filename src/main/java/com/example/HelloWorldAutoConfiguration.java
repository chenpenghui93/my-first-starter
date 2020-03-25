package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author cph
 */
@Configuration
@ConditionalOnClass({HelloWorldService.class})
@EnableConfigurationProperties(HelloWorldProperties.class)
public class HelloWorldAutoConfiguration {

    @Autowired
    private HelloWorldProperties properties;

    @Bean
    @ConditionalOnMissingBean(HelloWorldService.class)
    public HelloWorldService helloWorldService() {
        HelloWorldService service = new HelloWorldService();
        service.setMessage(properties.getMessage());
        return service;
    }

}
