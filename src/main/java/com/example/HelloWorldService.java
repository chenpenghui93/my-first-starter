package com.example;

/**
 * @Author cph
 * @Date 2020/3/25
 */
public class HelloWorldService {

    private String message;

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public String hello() {
        System.out.println("============");
        return "hello, " + message;
    }

}
