package com.learn.springBoot.roadmap.service;

import javax.mail.MessagingException;
import javax.mail.internet.AddressException;

public interface MailService {

    void sendSimpleMail(String to, String subject, String content) throws MessagingException;
    void sendHtmlMail(String to, String subject, String content);

    void sendAttachmentsMail(String to, String subject, String content, String filePath);

    void sendInlineResourceMail(String to, String subject, String content, String rscPath, String rscId);
}
