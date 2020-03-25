package com.example;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingClass;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;

@Configuration
@EnableConfigurationProperties(HttpProperties.class)
public class HttpAutoConfiguration {

    @Resource
    private HttpProperties properties;

    @Bean
    @ConditionalOnMissingClass
    public HttpClient init() {
        HttpClient client = new HttpClient();

        String url = properties.getUrl();
        client.setUrl(url);

        return client;
    }
}
