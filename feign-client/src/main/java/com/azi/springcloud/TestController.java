/**
 * Copyright 2019 the original author or authors.
 */
package com.azi.springcloud;

import com.netflix.discovery.EurekaClient;
import com.netflix.discovery.shared.Application;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

/**
 * @author Zhao Wanzi
 */
@RestController
@RequestMapping("/user")
public class TestController {

    @Value("${provider.user:user-provider}")
    private String userProvider;

    @Autowired
    private EurekaClient eurekaClient;

    @Autowired
    private UserApiCaller userApiCaller;

    @RequestMapping("/providers")
    @ResponseBody
    public List<String> listProviders() {
        Application application = eurekaClient.getApplication(userProvider);
        List<String> providers = application.getInstances().stream().map(ins -> ins.getIPAddr() + ":" + ins.getPort()).collect(Collectors.toList());
        return providers;
    }

    @RequestMapping("/nihao")
    public String nihao() {
        return userApiCaller.callHello();
    }
}
