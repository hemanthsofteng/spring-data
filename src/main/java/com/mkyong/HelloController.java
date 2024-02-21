package com.mkyong;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    Data data;

    @RequestMapping("/data")
    String hello() {
        // "Hello World, Spring Boot!";
        return data.toString();
    }

}