package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author cph
 * @Date 2020/3/25
 */
@ConfigurationProperties(prefix = "helloworld")
public class HelloWorldProperties {

    private String message = "world";

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
