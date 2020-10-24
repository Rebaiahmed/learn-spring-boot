package com.learn.springBoot.roadmap.web.templates;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class WebController {

    @RequestMapping(value = "/hello" , method = RequestMethod.GET)
    public String hello() {
        return "hello";
    }
}
