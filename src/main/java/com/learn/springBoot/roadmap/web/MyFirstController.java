package com.learn.springBoot.roadmap.web;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyFirstController {

    @RequestMapping("/hello")
    public String index() {
        return "Hello World";
    }
}
