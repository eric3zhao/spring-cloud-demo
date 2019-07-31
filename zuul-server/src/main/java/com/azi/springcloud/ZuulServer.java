/**
 * Copyright 2019 the original author or authors.
 */
package com.azi.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

/**
 * @author Zhao Wanzi
 */
@SpringBootApplication
@EnableZuulProxy
public class ZuulServer {
    public static void main(String[] args) {
        SpringApplication.run(ZuulServer.class, args);
    }
}
