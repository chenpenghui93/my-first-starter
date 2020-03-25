package com.example;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @Author cph
 * @Date 2020/3/25
 */
@ConfigurationProperties(prefix = "http")
public class HttpProperties {

    private String url = "http://www.baidu.com";

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
