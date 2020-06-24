package com.learn.springBoot.roadmap.web;


import com.learn.springBoot.roadmap.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @PostMapping("/mail")
    public void sendMail() {
       this.mailService.sendSimpleMail("ahmed.bouhmid94@gmail.com","first mail spring boot","hello world");
    }
}
