package com.learn.springBoot.roadmap.config.interceptor;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Component
public class UserControllerInterceptorConfig extends WebMvcConfigurerAdapter {

    @Autowired
    UserControllerInterceptor userControllerInterceptor;

    public void addInterceptors(InterceptorRegistry registry) {
        registry.addInterceptor(userControllerInterceptor);
    }
}
