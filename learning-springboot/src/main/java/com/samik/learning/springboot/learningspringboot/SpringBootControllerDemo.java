package com.samik.learning.springboot.learningspringboot;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by tosamik on 16/6/2017.
 */
@RestController
public class SpringBootControllerDemo {

    @RequestMapping("/")
    public String hello() {
        return "Hello";
    }
}
