/**
 * Copyright 2019 the original author or authors.
 */
package com.azi.springcloud;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @author Zhao Wanzi
 */
@FeignClient("${demo.cloud.applications.user.id}")
public interface UserApiCaller {

    @RequestMapping("/hello")
    String callHello();
}