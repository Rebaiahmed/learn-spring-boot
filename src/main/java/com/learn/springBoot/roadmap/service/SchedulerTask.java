package com.learn.springBoot.roadmap.service;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class SchedulerTask {
    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    private int count=0;


    @Scheduled(fixedDelay=5000)
    private void process()
    {
        this.logger.info(String.format("this is scheduler task runing  %d", count++));
    }
}
