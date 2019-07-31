/**
 * Copyright 2019 the original author or authors.
 */
package com.azi.springcloud;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * @author Zhao Wanzi
 */
@RestController
public class UserController {

    private static final String template = "Greetings, I'm %s!";

    @Autowired
    private UserProperty property;

    @RequestMapping("/hello")
    public String hello() {
        return String.format(template, Optional.ofNullable(property.getName()).orElse("Noone"));
    }
}
