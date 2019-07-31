/**
 * Copyright 2019 the original author or authors.
 */
package com.azi.springcloud;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Zhao Wanzi
 */
@Component
@ConfigurationProperties("azi.profile")
public class UserProperty {

    private String name;
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
